/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.csci305.javalab;

/**
 * Always plays the last move of its opponent, with the exception of round 1
 *
 * @author austi_000
 */
public class LastPlayBot extends Player{

    // Keep track of the opponent's last move
    private Element last = null;

    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        // Play randomly for the first round
        if(this.last == null){
            this.last = new RandomBot("RandomBot").play();
        }
        //System.out.println("LPB played: " + this.last.getName());
        return this.last;
    }

    @Override
    public void setLast(Element e){
        this.last = e;
    }

    @Override
    public void setOpponent(Player p){

    }


}
