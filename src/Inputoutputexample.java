
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debia7331
 */
public class Inputoutputexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        
        // asking the user o type in their name 
        System.out.println("Please enter your name");
        // scanning in their name into a variable
        String name2 = input.nextLine();
        String name = "Arvind";
        // String name = "Arvind"
        
        // saying hello to the user
        System.out.println("Hello" + name);
        
        // ask the user what year they were born 
        // use this to calculate their age
        System.out.println("What year were you born?");
        int year = input.nextInt();
        //determining their age
        int age = 2017 - year;
        if (age>0) {
        System.out.println("You are " + age + " years old!");
        }
        System.out.println(" Stop lying ");
    }
}
