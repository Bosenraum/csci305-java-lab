package main.java.csci305.javalab;

/**
 * Scissors move
 *
 * @author Austin Rosenbaum
 */
public class Scissors extends Element{

    public Scissors(String name){
        super("Scissors");
    }

    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";

        switch(e.getName()){
            case "Rock":
                output = "Rock smashes Scissors";
                result = "Lose";
                break;
            case "Paper":
                output = "Scissors cuts Paper";
                result = "Win";
                break;
            case "Scissors":
                output = "Scissors equals Scissors";
                result = "Tie";
                break;
            case "Lizard":
                output = "Scissors decapitate Lizard";
                result = "Win";
                break;
            case "Spock":
                output = "Spock smashes Scissors";
                result = "Lose";
                break;
            default:

                break;

        }

        return new Outcome(output, result);
    }
}
