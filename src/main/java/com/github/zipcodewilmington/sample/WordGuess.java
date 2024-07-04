package com.github.zipcodewilmington.sample;

import java.util.Random;
import java.util.Scanner;
//Bryan S
public class WordGuess {
    String[] words =  { "cat", "dog", "bog", "cut"};

    Random ranNum = new Random();
    int guessedNum = ranNum.nextInt(words.length);


    static void announceGame(){
       System.out.println("Welcome! to WORD Guess!!!!!!!!!!");
   }



   public void runGame(){
       boolean wordGuessed = false;
       announceGame();
//      while(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Guess a word");
          String input = scanner.nextLine();


//      }








   }
}
