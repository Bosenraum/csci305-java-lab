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
public class Rock extends Element {
    
    public Rock(String name){
        super("Rock");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";
        
        switch(e.getName()){
            case "Rock":
                output = "Rock equals Rock";
                result = "Tie";
                break;
            case "Paper":
                output = "Paper covers Rock";
                result = "Lose";
                break;
            case "Scissors":
                output = "Rock smashes Scissors";
                result = "Win";
                break;
            case "Lizard":
                output = "Rock crushes Lizard";
                result = "Win";
                break;
            case "Spock":
                output = "Spock vaporizes Rock";
                result = "Lose";
                break;
            default:
                
                break;
            
        }
        
        return new Outcome(output, result);
    }
    
}
