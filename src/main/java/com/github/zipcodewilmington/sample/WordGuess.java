package com.github.zipcodewilmington.sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Bryan S
public class WordGuess {
    static void announceGame(){
        System.out.println("Welcome! to WORD Guess!!!!!!!!!!");
    }


    public void runGame () {
        boolean wordGuessed = false;
        announceGame();


        String[] words = {"cat", "dog", "bog", "cut"};
        Scanner scanner = new Scanner(System.in);

        Random ranNum = new Random();// a container to choose/select a random word
        String secretWord = words[ranNum.nextInt(words.length)];// uses previously created container to choose random word from Array

        int remainingAttempts = secretWord.length(); // amount of guesses left tracked through the int length of the secret word chosen


        boolean gameRunning = true;// a container used to check if a game is running

        char[] answer = secretWord.toCharArray();
        char[] playerGuess = new char[answer.length];

//char[] wordPlaceholder = {'_', '_', '_'}; //An array to use as a placeholder for secret word
        while(gameRunning){
            Arrays.fill(playerGuess, '_');
        while (remainingAttempts > 0 && !wordGuessed) {

            System.out.println("Current Guess: ");
            displayCurrentGuess(playerGuess);

            if (remainingAttempts > 1) {
                System.out.println("You have" + " " + remainingAttempts + " " + "mistakes left. >:)");
            }else{
                System.out.println("You have" + " " + remainingAttempts + " " + "mistake left. >:)");
            }

            System.out.println("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean isCorrectGuess = false;

            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == guess) {

                    playerGuess[i] = guess;
                    isCorrectGuess = true;

                }
            }

            if (isCorrectGuess) {
                System.out.println("Correct guess!");
            } else {
                remainingAttempts--;
                System.out.println("Incorrect guess. Try again.");
            }

            if (Arrays.equals(answer, playerGuess)) {
                wordGuessed = true;
            }

        }

        if (wordGuessed) {
            System.out.println("***********");
            System.out.println(secretWord);
            System.out.println("Congratulations, You Won");
            System.out.println("***********");
        } else {
            System.out.println(":-/ :-( :-0");
            System.out.println("You Lost! You ran out of guesses.");


        }

        System.out.println("Would you like to play again? (yes/no)");
        String playAgain = scanner.nextLine().toLowerCase();

        if (playAgain.equalsIgnoreCase("yes")) {
            runGame();
        } else {
            System.out.println("Game over!");
        }
    }
        }
    public static void displayCurrentGuess(char[] playerGuesses) {
        for (char letter : playerGuesses) {
            System.out.print(letter + " ");
        }
    }
}