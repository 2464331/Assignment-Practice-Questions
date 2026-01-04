package sampleQuestions1.FourthQuestion;

import java.util.Scanner;

public class FourthQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = sc.nextLine();

        // Check for invalid characters (only alphabets and spaces allowed)
        if (!input.matches("[a-zA-Z ]*")) {
            System.out.println(input + " is an invalid sentence");
            return;
        }

        // Convert to lowercase
        input = input.toLowerCase();

        StringBuilder consonants = new StringBuilder();
        long product = 1;
        boolean hasConsonant = false;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) == -1) { // consonant check
                    consonants.append(c);
                    product *= c; // ASCII multiplication
                    hasConsonant = true;
                }
            }
        }

        if (!hasConsonant) {
            System.out.println("No consonants present in the sentence");
        } else {
            System.out.println("The output string is " + consonants.toString() + product);
        }
    }
}