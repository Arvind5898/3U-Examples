
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debia7331
 */
public class Condotions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Making new city
        City kw = new City();
        
        //Create a robot
        Robot karel = new Robot(kw, 4, 1, Direction.EAST);
        
        //create the path 
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        
        new Thing(kw, 3, 3);
        
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3); 
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        
        //turn on the thing labels 
        kw.showThingCounts(true);
        
        //step onto the first part of the path
        karel.move();
        
        //loop
        while(true){
        //if there are things pick them all up
            if(karel.canPickThing()){
                karel.pickThing();
            }
        //if holding 1 thing, move 
            if(karel.countThingsInBackpack()== 1){
                //dropthings
                karel.putThing();
                //move
                karel.move();
        //if holding 2 things, turn left
            }else if(karel.countThingsInBackpack() == 2) {
                //drop things
                karel.putThing();
                karel.putThing();
            
                //move
                karel.turnLeft();
                
        }
            //drop things
            
            //move
            
        //if holding 3 things, turn right
        
        //if holding 4 things, stop
            
        }
        
    }
}
