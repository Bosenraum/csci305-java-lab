package main.java.csci305.javalab;

/**
 * Player superclass, extended by specific bots and human player
 *
 * @author Austin Rosenbaum
 */
public abstract class Player {

    // create an array of the moves so each player can easily reference them
    protected final Element[] moves = {Driver.moves.get("Rock"),
                                     Driver.moves.get("Paper"),
                                     Driver.moves.get("Scissors"),
                                     Driver.moves.get("Lizard"),
                                     Driver.moves.get("Spock")};

    private final String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract Element play();

    // Used to store the opponent's last move
    public abstract void setLast(Element e);

    // Allows the player to know who their opponent is
    public abstract void setOpponent(Player p);

}
