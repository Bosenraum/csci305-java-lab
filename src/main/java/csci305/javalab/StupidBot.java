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
public class StupidBot extends Player {

    public StupidBot(String name){
        super(name);
    }

    /**
     *
     * @return
     */
    @Override
    public Element play() {
        return Driver.moves.get("Rock");
    }

    @Override
    public void setLast(Element e) {

    }

    @Override
    public void setOpponent(Player p){

    }

}
