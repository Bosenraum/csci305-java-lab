/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.csci305.javalab;

/**
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

    private Element playHuman(){
        return new RandomBot("RandomBot").play();
    }

    private Element playStupid(){
        return Driver.moves.get("Paper");
    }

    private Element playRandom(){
        return rand;
    }

    private Element playIterative(){
        Element choice = moves[counter++];
        return beat(choice);

    }

    private Element playLast(){
        Element play = null;

        if(last == null){
            play = new RandomBot("RandomBot").play();
        }else{
            play = beat(last);
        }

        last = play;

        return play;
    }

    private Element playMe(){
        // use a random non-human strategy this round
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
