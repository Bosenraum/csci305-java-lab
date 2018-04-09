package main.java.csci305.javalab;

/**
 * Paper move
 *
 * @author Austin Rosenbaum
 */
public class Paper extends Element{

    public Paper(String name){
        super("Paper");
    }

    @Override
    public Outcome compareTo(Element e){
        String output = "";
        String result = "";

        switch(e.getName()){
            case "Rock":
                output = "Paper covers Rock";
                result = "Win";
                break;
            case "Paper":
                output = "Paper equals Paper";
                result = "Tie";
                break;
            case "Scissors":
                output = "Scissors cuts Paper";
                result = "Lose";
                break;
            case "Lizard":
                output = "Lizard eats Paper";
                result = "Lose";
                break;
            case "Spock":
                output = "Paper disproves Spock";
                result = "Win";
                break;
            default:

                break;

        }

        return new Outcome(output, result);
    }
}
