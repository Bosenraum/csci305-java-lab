package main.java.csci305.javalab;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Human player, allows an element to be played via standard input
 *
 * @author Austin Rosenbaum
 */
public class Human extends Player{

    public Human(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element choice = null;
        Scanner in = new Scanner(System.in);
        int input = 0;

        printMenu();

        while(true){
            try{

                    System.out.print("Enter your move: ");
                    input = in.nextInt();
                    if(input >= 1 && input <= 5){
                        break;
                    }

            }catch(InputMismatchException e){
                in.next();
            }
            System.out.println("Invalid move. Please try again.");
        }

        switch(input){
            case 1:
                choice = Driver.moves.get("Rock");
                break;
            case 2:
                choice = Driver.moves.get("Paper");
                break;
            case 3:
                choice = Driver.moves.get("Scissors");
                break;
            case 4:
                choice = Driver.moves.get("Lizard");
                break;
            case 5:
                choice = Driver.moves.get("Spock");
                break;
            default:
                break;
        }

        return choice;
    }

    // Helper method to print the Human's menu
    private void printMenu(){
        System.out.println();
        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");
    }

    @Override
    public void setLast(Element e) {

    }

    @Override
    public void setOpponent(Player p){

    }

}
