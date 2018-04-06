/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.csci305.javalab;

/**
 *
 * @author austi_000
 */
public abstract class Player {
    
    private final String name;
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract Element play();
    
    public abstract void setLast(Element e);
    
}
