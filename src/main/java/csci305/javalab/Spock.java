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
public class Spock extends Element{
    
    public Spock(String name){
        super("Spock");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";
        
        switch(e.getName()){
            case "Rock":
                output = "Spock vaporizes Rock";
                result = "Win";
                break;
            case "Paper":
                output = "Paper disproves Spock";
                result = "Lose";
                break;
            case "Scissors":
                output = "Spock smashes Scissors";
                result = "Win";
                break;
            case "Lizard":
                output = "Lizard poisons Spock";
                result = "Lose";
                break;
            case "Spock":
                output = "Spock equals Spock";
                result = "Tie";
                break;
            default:
                
                break;
            
        }
        
        return new Outcome(output, result);
    }
}
