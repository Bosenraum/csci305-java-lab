/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author austi_000
 */
public class Outcome {
    private final String out;
    private final String result;
    
    public Outcome(String out, String result){
        this.out = out;
        this.result = result;
    }
    
    @Override
    public String toString(){
        //return this.out + " -- " + this.result;
        System.out.println("  " + out);
        return result;
    }
}
