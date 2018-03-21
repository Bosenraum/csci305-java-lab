package csci305.javalab;

import java.util.HashMap;
import java.util.Map;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austi_000
 */
public class Driver {
    
    static final Map moves = new HashMap();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rock rock = new Rock("Rock");
        Paper paper = new Paper("Paper");
        Scissors scissors = new Scissors("Scissors");
        Lizard lizard = new Lizard("Lizard");
        Spock spock = new Spock("Spock");
        
//        moves.put("Rock", rock);
//        moves.put("Paper", paper);
//        moves.put("Scissors", scissors);
//        moves.put("Lizard", lizard);
//        moves.put("Spock", spock);
        
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
        System.out.println();
    }
    
}
