/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author Austin
 */
public class MyBot extends Player{

    public MyBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        return Driver.moves.get("Paper");
    }

    @Override
    public void setLast(Element e) {
        
    }
    
}
