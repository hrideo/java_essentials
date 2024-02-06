package games;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args){
        int maxRolls = 5;
        int currentSpace = 0;
        int lastSpace = 20;
        Random random = new Random();

        System.out.println("Welcome to Roll the die game!");

        for(int i=0; i<maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d. You've rolled a %d. ", (i+1), die));

            if(currentSpace==lastSpace){
                System.out.println("You are on space " + currentSpace + ". Congrats you win.");
                break;
            }
            else if(currentSpace>lastSpace){
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose.");
                break;
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have "
                        + spacesToGo + " more to go.");
            }
        }

    }
}
