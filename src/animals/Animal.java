/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Al Zenk
 * Date: 04/13/2017
 * Description: Abstract class aimed at generalizing the concept of an animal
 */
public abstract class Animal 
{
    //Data members. Declared final because all animals will inherit from them.
    private final String species;
    private final int moveDistanceInFeet;
    
    //Constructor
    public Animal(String species, int moveDistanceInFeet)
    {
        this.species = species;
        this.moveDistanceInFeet = moveDistanceInFeet;
                
    }
    
    //Get method for species
    public String getSpecies()
    {
        return species;
    
    }
    
    //Get method for speed
    public int getmoveDistanceInFeet()
    {
        return moveDistanceInFeet;
    }
    
    //Abstract move method. Animals move in general, but do so in specific ways
    public abstract int move();
    
    @Override 
    public String toString()
    {
        return String.format("The  %s", species + " moved " + moveDistanceInFeet);
    }
}
