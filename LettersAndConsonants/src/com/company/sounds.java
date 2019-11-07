package com.company;

/*
Purpose: This program will count the number of vowels & consonants
Input: The user Will input any word and be prompted to select a choice of action
Processing: Correlating with the users choice the program will run the word though a for loop; counting the vowels and consonants
Output: Display answer to the users request
 */

import java.util.*;
public class sounds {
    /**
     * Vowels
     */
    private static final char a = 'a';
    private static final char e = 'e';
    private static final char i = 'i';
    private static final char o = 'o';
    private static final char u = 'u';
    private static final char y = 'y';

    /**
     * choices
     */

    private static final  char b = 'b';
    private static final  char c = 'c';
    private static final  char d = 'd';

    private char choice;
    private char CharInput;
    private Scanner input = new Scanner(System.in);
    private char[] wordInput;
    private int vowelCount = 0, constantCount = 0;

    /*
    Prompts user to enter a word and calls method selectChoice & count VC
     */
    public void startWordCheck() {
        System.out.print("Enter a Word: ");
        wordInput = input.nextLine().toCharArray();
        selectChoice();
        countVC();
    }

    /*
    Displays Menu and extracts users choice
     */
    private void selectChoice() {
        System.out.print("Select an option by entering the letter: \n"+
                "   A. Count the number of vowels in the string. \n"+
                "   B. Count the number of consonants in the string. \n"+
                "   C. Enter new string. \n"+
                "   D. Exit the program. \n");

        //Choices is saved as users next char input.
        //Code turns users input into lower case and trims spaces
        choice = input.nextLine().trim().toLowerCase().charAt(0);
    }

    /*
    Loops through word and executes users choice
     */
    private void countVowelAndConsonants() {
        vowelCount = 0;
        constantCount = 0;

        for(int index = 0; index < wordInput.length; index++) {
            char character = wordInput[index];
            if (character == a || character == e || character == i || character ==o){
                vowelCount++;
            }else if (character == y) {
                vowelCount++;
                constantCount++;
            }else{
                constantCount++;
            }
        }
    }

    private void countVC() {
        switch (choice) {
            case c:
                startWordCheck();
                break;
            case d:
                System.exit(0);
                break;
            case a:
                countVowelAndConsonants();
                System.out.println("The number of vowels in the word are "+vowelCount);
                startWordCheck();
                break;
            case b:
                countVowelAndConsonants();
                System.out.println("The number of consonants in the word are "+constantCount);
                startWordCheck();
                break;
            default:
                break;
        }
    }
}
