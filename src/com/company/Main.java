package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Pick a random number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int difference;
        int number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int guess = scanner.nextInt();
        System.out.println("your guess is: " + guess);
        System.out.println("The number i was thinking of is: " + number);
        if (number > guess){
            difference = number - guess;
            System.out.println("You were off by " + difference);
        } else if (number < guess) {
            difference = guess - number;
            System.out.println("You were off by " + difference);
        } else {
            System.out.println("Spot on! nice guess!");
        }
    }
}
