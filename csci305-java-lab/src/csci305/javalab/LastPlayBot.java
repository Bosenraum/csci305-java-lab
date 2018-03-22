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
public class LastPlayBot extends Player{
    
    private Element last = null;

    public LastPlayBot(String name) {
        super(name);
    }
    
    public void setLast(Element e){
        this.last = e;
    }

    @Override
    public Element play() {
        if(this.last == null){
            this.last = Driver.players.get("RandomBot").play();
        }
        System.out.println("LPB played: " + this.last.getName());
        return this.last;
    }
    
}
