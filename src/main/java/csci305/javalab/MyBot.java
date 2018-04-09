package main.java.csci305.javalab;

/**
 * Employs a different strategy for each opponent it plays against
 *
 * @author Austin
 */
public class MyBot extends Player{

    private Player opp = null;
    private Element last = null;
    private int counter = 0;
    private Element rand = null;


    public MyBot(String name) {
        super(name);
        rand = new RandomBot("RandomBot").play();
    }

    @Override
    public Element play() {
      // Change the strategy depending on the other player

      Element choice = null;

      switch(opp.getName()){
        case "Human":
          choice = playHuman();
          break;
        case "StupidBot":
          choice = playStupid();
          break;
        case "RandomBot":
          choice = playRandom();
          break;
        case "IterativeBot":
          choice = playIterative();
          break;
        case "LastPlayBot":
          choice = playLast();
          break;
        case "MyBot":
          choice = playMe();
          break;
        default:
          System.out.println("Who are you?!");
          break;
      }
        return choice;
    }

    // Play randomly against a human
    private Element playHuman(){
        return new RandomBot("RandomBot").play();
    }

    // Always beat the stupidBot by playing Paper
    private Element playStupid(){
        return Driver.moves.get("Paper");
    }

    // Play a single move against RandomBot that is itself chosen randomly one time
    private Element playRandom(){
        return rand;
    }

    // Always beat the iterativeBot by tracking its moves and then beating them
    private Element playIterative(){
        Element choice = moves[counter++];
        return beat(choice);

    }

    // Always beat the LastPlayBot by storing MyBot's previous move and then beating that next time
    private Element playLast(){
        Element play = null;

        if(last == null){
            play = new RandomBot("RandomBot").play();
        }else{
            play = beat(last);
        }

        // Update MyBot's last move
        last = play;

        return play;
    }

    // When playing another MyBot, use a random non-human strategy
    private Element playMe(){

        int strategy = (int)(Math.random() * 4);
        Element choice = null;
        switch(strategy){
            case 0:
                choice = playStupid();
                break;
            case 1:
                choice = playRandom();
                break;
            case 2:
                choice = playIterative();
                break;
            case 3:
                choice = playLast();
                break;
        }
        return choice;
    }

    // Helper method that always beats the input Element
    private Element beat(Element e){
        Element result = null;

        switch(e.getName()){
            case "Rock":
                result = Driver.moves.get("Paper");
                break;
            case "Paper":
                result = Driver.moves.get("Scissors");
                break;
            case "Scissors":
                result = Driver.moves.get("Rock");
                break;
            case "Lizard":
                result = Driver.moves.get("Rock");
                break;
            case "Spock":
                result = Driver.moves.get("Paper");
                break;
        }

        return result;
    }

    @Override
    public void setLast(Element e) {
        last = e;
    }

    @Override
    public void setOpponent(Player p){
        opp = p;
    }

}
