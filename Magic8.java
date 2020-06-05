/*
    Author: Myles Garcia
    Date: 6-4-2020
    Description: 
    Program uses the Random library and calls 
    a random integer that then displays a random
    string to the user. This is supposed to simulate 
    a Magic 8-Ball, whenever you run the program
    it shows a different fortune.
*/


import java.util.Random;
import java.util.*;

class Magic8Ball {

    //The variables that would be used through the entire class
    String fortune;
    int randomInt;

    //This is where the random fortune is produced by calling the random function
    public void randFortune(){
        Random random = new Random();
        int upperbound = 10;

        int randomInt = random.nextInt(upperbound);

        switch(randomInt){
            case 0:
                fortune = "A beautiful, smart, and loving person will be coming into your life.";
                break;
            case 1:
                fortune = "A dubious friend may be an enemy in camouflage.";
                break;
            case 2:
                fortune = "A faithful friend is a strong defense.";
                break;
            case 3:
                fortune = "A feather in the hand is better than a bird in the air.";
                break;
            case 4:
                fortune = "A fresh start will put you on your way.";
                break;
            case 5:
                fortune = "A friend asks only for your time not your money.";
                break;
            case 6:
                fortune = "A friend is a present you give yourself.";
                break;
            case 7:
                fortune = "A golden egg of opportunity falls into your lap this month.";
                break;
            case 8:
                fortune = "A good time to finish up old tasks.";
                break;
            case 9:
                fortune = "A lifetime friend shall soon be made.";
                break;
            default:
                fortune = "Get another fortune.";
                break;
        }

        System.out.println(fortune + "\n");
    }

    //Main fucntion where the methods are executed.
    public static void main(String[] args) {
        
        Magic8Ball shake = new Magic8Ball();
        System.out.println("Here is your fortune: \n");
        shake.randFortune();
    }
}