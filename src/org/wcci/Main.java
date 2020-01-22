package org.wcci;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberUserGuessed;
        int MAX = 10;
        int answer;
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        System.out.println("What number am i thinking?");
        Scanner scanner = new Scanner(System.in);


        int count = 0;
        while (count < 2) {
            if(count == 1){
                System.out.println("YOU HAVE ONE MORE TURN LEFT!");
            }
            numberUserGuessed = scanner.nextInt();
            count++;
            if (numberUserGuessed == 0) {
                System.out.println("Guess a number between 1 and 10 again");
                numberUserGuessed = scanner.nextInt();
            }
            if (numberUserGuessed == -1) {
                System.out.println("EXITING GAME, Thanks for playing!");
                break;
            }
            if (numberUserGuessed == answer) {
                System.out.println("You have guessed the correct answer!");
                break;
            }
            if (numberUserGuessed < answer) {
                System.out.println("Try a higher number!");
            }else {
                System.out.println("Try a lower number!");
            }
            if (count == 2) {
                System.out.println("Sorry, you ran out of turns and lost!");
                System.out.println("The correct answer was " + answer);
            }
        }

    }
}
