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
public class Lizard extends Element{
    
    public Lizard(String name){
        super("Lizard");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";
        
        switch(e.getName()){
            case "Rock":
                output = "Rock crushes Lizard";
                result = "Lose";
                break;
            case "Paper":
                output = "Lizard eats Paper";
                result = "Win";
                break;
            case "Scissors":
                output = "Scissors decapitate  Lizard";
                result = "Lose";
                break;
            case "Lizard":
                output = "Lizard equals Lizard";
                result = "Tie";
                break;
            case "Spock":
                output = "Lizard poisons Spock";
                result = "Win";
                break;
            default:
                
                break;
            
        }
        
        return new Outcome(output, result);
    }
}
