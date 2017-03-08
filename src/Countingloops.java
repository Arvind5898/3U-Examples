
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author debia7331
 */
public class Countingloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a city 
        City kw = new City();

        // Creating a robot
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        // Make a counter
        int counter = 0;

        // Move five times using a condition 
        while (counter < 5) {
            //move
            bob.move();
            //increase the counter 
            counter = counter + 1;
            //counter==; <- shortcut to add 1 
            //counter += 1; <- another shortcut 

        }
        bob.turnAround();

        // Using a for loop to count 
        // For(define a variable; condition to loop; change variable)
        for (int i = 0; i < 5; i = i + 1) {
            bob.move();

            // COMPOUND CONDITIONS
            // && <- AND statement - both must be true 
            // || <- OR statement - one of them must be true 
        }
        if (bob.frontIsClear()) {
            if (bob.countThingsInBackpack() == 5) {
            }
        }
    }
}
