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
public class Paper extends Element{
    
    public Paper(String name){
        super("Paper");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";
        
        switch(e.getName()){
            case "Rock":
                output = "Paper covers Rock";
                result = "Win";
                break;
            case "Paper":
                output = "Paper equals Paper";
                result = "Tie";
                break;
            case "Scissors":
                output = "Scissors cuts Paper";
                result = "Lose";
                break;
            case "Lizard":
                output = "Lizard eats Paper";
                result = "Lose";
                break;
            case "Spock":
                output = "Paper disproves Spock";
                result = "Win";
                break;
            default:
                
                break;
            
        }
        
        return new Outcome(output, result);
    }
}
