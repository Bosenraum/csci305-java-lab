/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memmgmt;

/**
 *
 * @author Austin
 */
public class MemoryManager {
    
    static private final int NULL = -1;
    private int[] mem;
    private int stackTop;
    private int heapTop;
    private int freeStart;
    private int totalMemSpace;
    
    public MemoryManager(int[] initialMemory){
        mem = initialMemory;
        stackTop = mem.length;
        totalMemSpace = mem.length;
        heapTop = 0;
        
        mem[0] = totalMemSpace; // one big free block
        mem[1] = NULL; // free list ends with it
        freeStart = 0;
    }
    
    public int push(int requestSize) {
        int oldtop = stackTop;
        stackTop -= (requestSize + 1); // extra word for oldtop
        if (totalMemSpace < requestSize)
          throw new StackOverflowError();
        mem[stackTop] = oldtop;
        return stackTop + 1;
  }
    
    public void pop(){
        stackTop = mem[stackTop];
    }
    
    public int allocate(int requestSize) {
        int size = requestSize + 1; // size including header

        // Do first-fit approach: linear search of the free
        // list for the first block of sufficient size

        int p = freeStart; // head of free list
        int lag = NULL;
        while (p != NULL && mem[p] < size) {
          lag = p; // lag is previous p
          p = mem[p + 1]; // link to next block
        }
        if (p == NULL) // no block large enough
          throw new OutOfMemoryError();
        int nextFree = mem[p + 1]; // block after p

        // Now p is the index of a block of sufficient size
        // lag is the index of p's predecessor in the
        // free list, or NULL, and nextFree is the index of
        // p's successor in the free list, or NULL.
        // If the block has more space than we need, carve
        // out what we need from the front and return the
        // unused end part to the free list.

        int unused = mem[p]-size; // extra space in blcok
        if (unused > 1) { // if more than a header's worth
          nextFree = p + size; // index of the unused piece
          mem[nextFree] = unused; // fill in size
          mem[nextFree + 1] = mem[p + 1]; // fill in link
          mem[p] = size; // reduce p's size accordingly
        }

        // Link out the block we are allocating and done.

        if (lag == NULL) freeStart = nextFree;
        else mem[lag + 1] = nextFree;
        return p + 1; // index of useable word (after header)
    }
    
    public void deallocate(int address) {
        int addr = address - 1; // real start of the block

        // Find the insertion point in the sorted free list
        // for this block

        int p = freeStart;
        int lag = NULL;
        while (p != NULL && p < addr) {
          lag = p;
          p = mem[p + 1];
        }

        // Now p is the index of the block to come after
        // ours in the free list, or NULL, and lag is the
        // index of the block to come before ours in the
        // free list, or NULL.

        // If the one to come after ours is adjacent to it,
        // merge it into ours and restore the property
        // described above.

        if (addr + mem[addr] == p) {
          mem[addr] += mem[p]; // add its size to ours
          p = mem[p + 1];
        }

        if (lag == NULL) { // ours will be first free
          freeStart = addr;
          mem[addr + 1] = p;
        }
        else if (lag + mem[lag] == addr) { // block before is adjacent to ours
          mem[lag] += mem[addr]; // merge ours into it
          mem[lag + 1] = p;
        }
        else { // neither, just a simple insertion
          mem[lag + 1] = addr;
          mem[addr + 1] = p;
        }
    }
}
