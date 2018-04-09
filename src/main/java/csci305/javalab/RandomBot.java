package main.java.csci305.javalab;

/**
 * Plays a random from the five available
 *
 * @author Austin Rosenbaum
 */
public class RandomBot extends Player{

    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        int choice = (int)(Math.random() * 5);
        Element result = moves[choice];
        return result;
    }

    @Override
    public void setLast(Element e) {}

    @Override
    public void setOpponent(Player p){}

}
