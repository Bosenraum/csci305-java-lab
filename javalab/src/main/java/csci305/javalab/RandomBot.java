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
public class RandomBot extends Player{

    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        int choice = (int)(Math.random() * 5) + 1;
        Element result = null;
        switch(choice){
            case 1:
                result = Driver.moves.get("Rock");
                break;
            case 2:
                result = Driver.moves.get("Paper");
                break;
            case 3:
                result = Driver.moves.get("Scissors");
                break;
            case 4:
                result = Driver.moves.get("Lizard");
                break;
            case 5:
                result = Driver.moves.get("Spock");
                break;
            default:
                break;
        }
        return result;
    }
    
    @Override
    public void setLast(Element e) {
        
    }
    
}
