package main.java.csci305.javalab;

/**
 * Always plays Rock
 *
 * @author Austin Rosenbaum
 */
public class StupidBot extends Player {

    public StupidBot(String name){
        super(name);
    }

    /**
     *
     * @return
     */
    @Override
    public Element play() {
        return Driver.moves.get("Rock");
    }

    @Override
    public void setLast(Element e) {

    }

    @Override
    public void setOpponent(Player p){

    }

}
