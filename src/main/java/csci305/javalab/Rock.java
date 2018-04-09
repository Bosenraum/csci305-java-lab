package main.java.csci305.javalab;

/**
 * Rock move
 *
 * @author Austin Rosenbaum
 */
public class Rock extends Element {

    public Rock(String name){
        super("Rock");
    }
    
    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";

        switch(e.getName()){
            case "Rock":
                output = "Rock equals Rock";
                result = "Tie";
                break;
            case "Paper":
                output = "Paper covers Rock";
                result = "Lose";
                break;
            case "Scissors":
                output = "Rock smashes Scissors";
                result = "Win";
                break;
            case "Lizard":
                output = "Rock crushes Lizard";
                result = "Win";
                break;
            case "Spock":
                output = "Spock vaporizes Rock";
                result = "Lose";
                break;
            default:

                break;

        }

        return new Outcome(output, result);
    }

}
