package M3;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // there's a lot of repeated code and it's not the cleanest. We'll see later how
        // to improve this
        try (Scanner input = new Scanner(System.in);) {
            System.out.println("Welcome to NumberGuesser2.0");
            System.out.println("To exit, type the word 'quit'.");

            // let's make it interesting with levels and strikes
            int level = 1;
            int strikes = 0;
            int maxStrikes = 5;
            int number = -1;
            int hintsused = 1;
            boolean pickNewRandom = true;

            do {
                if (pickNewRandom) {
                    int range = 9 + ((level - 1) * 5);
                    System.out.println("Welcome to level " + level);
                    System.out.println(
                            "I picked a random number between 1-" + (range + 1) + ", let's see if you can guess.");
                    number = new Random().nextInt(range) + 1;
                    pickNewRandom = false;
                }
                System.out.println("Type a number and press enter");

                String message = input.nextLine();
                // early termination check
                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("Tired of playing? No problem, see you next time.");
                    break;
                }

                //6. Add a hint command that can be used once per level and only after 2 strikes have been used that'
                // reduces the range around the correct number (i.e., number is 5 and range is initially 1-15,
                //new range could be 3-8 as a hint)
                
                //mbk28 2/12/2023

                if (message.equalsIgnoreCase("hint")) {

                    if(hintsused > 1){

                        System.out.println("You've used your hints for this level");

                    }else if (strikes < 2) {
                        
                        System.out.println("You neeed to use 2 strike before you can use a hint");
                          
                    
                    }else{

                        hintsused++;

                        int hintrange = 9 + ((level - 1) * 5);
                        
                        System.out.println("the number is between " + (number / 2) + " and " + (((hintrange + number)/2)+1));

                    }

                }

                int guess = -1;// default value
                try {
                    // inner catch to lazily check if the entered value is a number
                    // we won't output the error since it should be expected to be a number paring
                    // problem
                    guess = Integer.parseInt(message);
                } catch (Exception e) {
                    System.out.println("You didn't enter a number, please try again");
                }
                if (guess > -1) {
                    System.out.println("You guessed " + guess);
                    if (guess == number) {
                        System.out.println("That's right!");
                        level++;// level up!
                        strikes = 0;// make sure we clear these out, otherwise it's not really fair
                        hintsused = 1;
                        pickNewRandom = true;

                    } else {
                        System.out.println("That's wrong");
                        strikes++;
                        if (strikes >= maxStrikes) {
                            System.out.println("Uh oh, looks like you need to get some more practice.");
                            strikes = 0;
                            level--;
                            //prevent level from being less than 1
                            if (level < 1) {
                                level = 1;
                            }
                            pickNewRandom = true;

                        
                        }
                        //1. Display higher or lower as a hint after a wrong guess

                        //mbk28 2/12/2023
                        
                        else if (guess > number ){

                            System.out.println("your guess is too high");

                        } else if(guess < number){

                            System.out.println("your guess is too low");

                        }


                    }

                }
            } while (true);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Goodbye.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Thanks for playing!");
    }
}

