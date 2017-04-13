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
 * Description: Simple program to demonstrate concepts such as abstraction,
 * inheritance and polymorphism.
 */
public abstract class Animals {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Create instance of Tortoise object
       Tortoise newTortoise = new Tortoise("Tortoise", 1); 

       System.out.print(newTortoise);
    }
    

}
