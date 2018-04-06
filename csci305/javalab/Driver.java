package csci305.javalab;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Austin Rosenbaum
 * @course CSCI-305
 */
public class Driver {
    
    // Create a constant Map for all of the elements
    static final Map<String, Element> moves = new HashMap();
    //static final Map<String, Player> players = new HashMap();
    

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
        
        // Create main menu
        mainMenu();
        Player p1 = playerSelect(1);
        Player p2 = playerSelect(2);
        
        System.out.println("\n" + p1.getName() + " vs " + p2.getName() + ". Go!");
        
        int p1Count = 0;
        int p2Count = 0;
        String outcome = "";
        
        for(int i = 0; i < 5; i++){
            
            Element e1 = p1.play();
            Element e2 = p2.play();
            
            System.out.println("\nRound " + (i+1) + ":");
            System.out.println("  Player 1 chose " + e1.getName());
            System.out.println("  Player 2 chose " + e2.getName());
            //System.out.println(e1.compareTo(e2));
            outcome = e1.compareTo(e2).toString();
            
            // Check who won and update counts
            switch (outcome) {
                case "Win":
                    System.out.println("  Player 1 won the round");
                    p1Count++;
                    break;
                case "Lose":
                    System.out.println("  Player 2 won the round");
                    p2Count++;
                    break;
                default:
                    System.out.println("  Round was a tie");
                    break;
            }
            
            // Handle the LastPlayBot condition
            if(p1.getName().equals("LastPlayBot")){
                p1.setLast(e2);
            }
            if(p2.getName().equals("LastPlayBot")){
                p2.setLast(e1);
            }
            
        }
        
        // Print out the scores
        System.out.println("\nThe score is " + p1Count + " to " + p2Count + ".");
        
        // Determine the overall winner
        if(p1Count > p2Count){
            System.out.println("Player 1 wins!");
        }else if(p1Count < p2Count){
            System.out.println("Player 2 wins!");
        }else{
            System.out.println("Game was a draw.");
        }
        

    }
    
    private static void mainMenu(){
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Austin Rosenbaum!\n");
        System.out.println("Please chose two players:");
        System.out.println("    (1) Human");
        System.out.println("    (2) StupidBot");
        System.out.println("    (3) RandomBot");
        System.out.println("    (4) IterativeBot");
        System.out.println("    (5) LastPlayBot");
        System.out.println("    (6) MyBot");
        System.out.println();        
    }
    
    private static Player playerSelect(int n){
        Player choice = null;
        Scanner in = new Scanner(System.in);
        
        while(true){
            try{
                System.out.print("Select player " + n + ": ");        
                int input = in.nextInt();
                
                if(input >= 1 && input <= 6){
                    
                    switch(input){
                        case 1:
                            choice = new Human("Human");
                            break;
                        case 2:
                            choice = new StupidBot("StupidBot");
                            break;
                        case 3:
                            choice = new RandomBot("RandomBot");
                            break;
                        case 4:
                            choice = new IterativeBot("IterativeBot");
                            break;
                        case 5:
                            choice = new LastPlayBot("LastPlayBot");
                            break;
                        case 6:
                            choice = new MyBot("MyBot");
                            break;
                        default:
                            break;
                    }
                    break;
                }
                
            }catch(InputMismatchException e){
                in.next();
            }
            System.out.println("Invalid choice. Please try again.");
        }
        
        return choice;
    }
    
}
