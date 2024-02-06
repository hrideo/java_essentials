package games;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args){

        int maxRolls = 5;
        int currentSpace = 0;
        int lastSpace = 20;
        Random random = new Random();

        System.out.println("Welcome to Roll the die game!");
        for(int i=0; i<=maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace +die;

            lastSpace = lastSpace - die;
            System.out.println("Roll #" + (i+1) + ":" + " You've rolled a " + die + ".");

            if(currentSpace<20){
                System.out.println("You are now on space " + currentSpace + " and have "
                        + lastSpace + " more to go.");
            }
            else if(currentSpace==20){
                System.out.println("You are on space " + currentSpace + ". Congrats you win.");
                break;
            }
            else{
                System.out.println("Invalid space: " + currentSpace);
            }
        }

    }
}
