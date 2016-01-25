/**
 * Created by lewis on 1/20/16.
 */
/**
 *
 */

import java.util.ArrayList;
import java.util.List;
        import java.util.Random;
/**
 * @author lewis
 *
 */
public class Card {

    Random ran1 = new Random();	// Random Class used for a RNG

    private int age = 0; // Private Integer Age only accessible with getters and setters
    public String name; // Public String name used for names of strings


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param args
     */
 /*
  * Default Constructor
  *
  * Given for free
  *
  */


    String name1;

    public Card() {



        this.name = "squid";

    }
    public Card(String rand) {
        this.age = ran1.nextInt(150);
    }

    /**
     *
     * @param none
     * Using random to generate a random age for the card using java.util.Random Class
     *
     *
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
/*
 * Card 1-10 with RNG for the card numbers.
 */

        Card[] cards = new Card[10];

        for(int i = 0; i < cards.length; i++ ) {

            cards[i] = new Card("turtlesoup");
            System.out.println("Youngest Card Is " + cards[i].getAge() /* cards[i].getName() */);


        }

/*
 * look for youngest and name
 *
 * Don't Do It Like This!!!
 *
 * I'm stupid and used else if which can complicate things.
 *
 */


    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static char RanChar() {
        Random r = new Random();
        char random_3_Char = (char) (48 + r.nextInt(47));
        return random_3_Char;
    }

}