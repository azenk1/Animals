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
 * Description: Class showing specificity and inheritance from Animal Class.
 */
public class Tortoise extends Animal{

    private  int moveDistanceInFeet;
    private  String species;
    
    
   
    //Constructor
    public Tortoise(String species, int moveDistanceInFeet)
    {
        super(species, moveDistanceInFeet);
    }
    
    @Override
    public int move() 
    {
        return moveDistanceInFeet;
    }
    

}
