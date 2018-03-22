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
    
    // Create a constant Map for all of the elements
    static final Map<String, Element> moves = new HashMap();
    static final Map<String, Player> players = new HashMap();
    static private Element lastPlayed = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Elements
        Rock rock = new Rock("Rock");
        Paper paper = new Paper("Paper");
        Scissors scissors = new Scissors("Scissors");
        Lizard lizard = new Lizard("Lizard");
        Spock spock = new Spock("Spock");
        
        // Create mapping
        moves.put("Rock", rock);
        moves.put("Paper", paper);
        moves.put("Scissors", scissors);
        moves.put("Lizard", lizard);
        moves.put("Spock", spock);
        
        // Player Bots
        StupidBot stupid = new StupidBot("StupidBot");
        RandomBot random = new RandomBot("RandomBot");
        IterativeBot iter = new IterativeBot("IterativeBot");
        LastPlayBot lpb = new LastPlayBot("LastPlayBot");
        Human human = new Human("Human");
        
        players.put("StupidBot", stupid);
        players.put("RandomBot", random);
        players.put("IterativeBot", iter);
        players.put("LastPlayBot", lpb);
        players.put("Human", human);
        
        for(int i = 0; i < 5; i++){
            System.out.println(players.get("Human").play().compareTo(moves.get("Rock")));
        }
//        for(int i = 0; i < 10; i++){
//            lastPlayed = players.get("IterativeBot").play();
//            System.out.println(players.get("LastPlayBot").play().compareTo(lastPlayed));
//            lpb.setLast(lastPlayed);
//        }
        
//        System.out.println(moves.get("Rock").compareTo(stupid.play()));
//        System.out.println(stupid.play().compareTo(random.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(moves.get("Rock").compareTo(iter.play()));
//        System.out.println(paper.compareTo(rock));
//        System.out.println(rock.compareTo(rock));
    }
    
}
