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
public class IterativeBot extends Player{

    private int counter = 1;
    
    public IterativeBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element result = null;
        
        switch(counter){
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
        
        this.counter++;
        if(this.counter > 5){
            this.counter = 1;
        }
        
        return result;
    }
    
    @Override
    public void setLast(Element e) {
        
    }
    
}
