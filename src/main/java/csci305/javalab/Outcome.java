package main.java.csci305.javalab;

/**
 * Retrun type for all Element's 'compareTo' method, helps format game output
 *
 * @author Austin Rosenbaum
 */
public class Outcome {
    private final String out;
    private final String result;

    public Outcome(String out, String result){
        this.out = out;
        this.result = result;
    }

    @Override
    public String toString(){
        // Print the outcome string, return the win/lose/tie string
        System.out.println("  " + out);
        return result;
    }
}
