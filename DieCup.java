import java.util.Random;

/**
 * This class models a DieCup (raflebæger)
 * 
 * @author Lars Nguyen & Jonas Kirkegaard
 * @version 2022-08-31
 **/
public class DieCup {
    private Die d1;   // First die
    private Die d2;   // Second die
    private int maxEyes; // Viser det højste antal øjne
    /**
     * Constructor for DieCup objects
     */
    public DieCup() {
        d1 = new Die();
        d2 = new Die();
        maxEyes=getEyes();
    }
    
     /**
     * Obtain a new number of eyes for both dice
     */
    public void roll() {
        d1.roll();
        d2.roll();
       if(getEyes()>maxEyes)
           {
           maxEyes=getEyes();
            }
    }
    
    /**
     * Return the sum of the number of eyes shown by the two dice
     */
    public int getEyes() {
        return d1.getEyes()+d2.getEyes();
    }
    
    /**
     * Return the higest sum of the number of eyes shown by the two dice
     */
    public int getMaxEyes()
    {
        return maxEyes;
    }
    
    /**
     * Resets the higeste number of eyes
     */
    public void resetMaxEyes()
    {
        maxEyes=0;
    }   
    
    /**
     * Makes multiple rolls and prints the result
     * also counts the sum of the eyes and finds the average
     */
    public void multipleRolls(int noOfRolls)
    {
        double sumofEyes = 0; 
        double average = 0 ;
        for(int i = 1; i<=noOfRolls; i++) 
            {
            roll();
            System.out.println("Throw no " + i + ": " + getEyes());
            sumofEyes+=getEyes();
            }
        average=sumofEyes / noOfRolls;
        System.out.println("Average no of eyes: " + average);
        sumofEyes=0; 
    }   
    }   
