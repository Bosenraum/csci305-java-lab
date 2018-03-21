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
public class Scissors extends Element{
    
    public Scissors(String name){
        super("Scissors");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";
        
        switch(e.getName()){
            case "Rock":
                output = "Rock smashes Scissors";
                result = "Lose";
                break;
            case "Paper":
                output = "Scissors cuts Paper";
                result = "Win";
                break;
            case "Scissors":
                output = "Scissors equals Scissors";
                result = "Tie";
                break;
            case "Lizard":
                output = "Scissors decapitate Lizard";
                result = "Win";
                break;
            case "Spock":
                output = "Spock smashes Scissors";
                result = "Lose";
                break;
            default:
                
                break;
            
        }
        
        return new Outcome(output, result);
    }
}
