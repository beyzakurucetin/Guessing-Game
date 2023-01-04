package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        guessingGame();


    }


    public static void guessingGame() {
        System.out.println("Welcome to Guessing Game! In order to guess please enter a number between 1 to 10");
        System.out.println("You should guess the number at 5 tries");


        Scanner scanner = new Scanner(System.in);
        Random random=  new Random();



        int chosenNumber= random.nextInt(11);
        int tryNumber = 0;
        int leftChance=5;
       do {
           System.out.println("Enter the number");

           int givenNumber = scanner.nextInt();


           if (givenNumber == chosenNumber) {
               System.out.println("Congratulations, you won! :)");
               break;

           } else if (givenNumber < chosenNumber) {

               System.out.println("The number is greater than " + givenNumber);
               tryNumber++;

           } else if (givenNumber > chosenNumber) {

               System.out.println("The number is less than " + givenNumber);
              tryNumber++;
           }  if (tryNumber == 5) {
               System.out.println("You've exhausted, try again later :/ ");
               System.out.println("The number was " + chosenNumber);
           }

       }while (tryNumber<leftChance);

            }
        }









