/*
Objective 2:
Write a program that takes a sentence as input and reverses the order of characters in each word
while maintaining the original order of words.

Requirements:

Prompt the user to input a sentence (a string with multiple words separated by spaces).
Use a StringBuilder to reverse each word individually.
Print the modified sentence with each word’s characters reversed, but the word order kept the same.
Example:

Input: "Hello World from Java"
Output: "olleH dlroW morf avaJ"
*/

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite quote");
        String sentence = scanner.nextLine();

        StringBuilder mainSentence = new StringBuilder();

        mainSentence.append(sentence);

        System.out.println("Main Sentence is as follows:");
        System.out.println(mainSentence);

        System.out.println("=================================================================================");

        mainSentence.reverse();

        System.out.println("Reversed Sentence is as follows:");
        System.out.println(mainSentence);
    }
}
