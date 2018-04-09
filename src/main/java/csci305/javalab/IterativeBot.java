package main.java.csci305.javalab;

/**
 * Plays through each possible move in order once, then loops and plays them again.
 *
 * @author Austin Rosenbaum
 */
public class IterativeBot extends Player{

    // Keep track of moves played for looping
    private int counter = 0;

    public IterativeBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element choice = moves[counter++];
        if(counter > 4)
            counter = 0;
        return choice;

    }

    @Override
    public void setLast(Element e) {

    }

    @Override
    public void setOpponent(Player p){

    }

}
