
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. babo
 */

/**
 *
 * @author debia7331
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a city
        City chiraq = new City();
        
        //New things
        new Thing(chiraq, 1, 1);
        new Thing(chiraq, 1, 2); 
        new Thing(chiraq, 0, 2);
        new Thing(chiraq, 0, 1);
        
        // Creating a robot 
        Robot bb = new Robot(chiraq, 1, 1, Direction.EAST);
        
        //new wall
        new Wall(chiraq, 1, 5, Direction.EAST);
        
        //inifinite loop
        
                bb.move();
                bb.turnLeft();   
        //pick thing up
        if(bb.canPickThing()){
            bb.pickThing();
            
        }
        }
        //did bb hit a wall
        
                
        
        
    }

