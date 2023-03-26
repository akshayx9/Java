package Assignments;

/* Problem Statement 1:

Write a program which creates a String “Welcome to Java World” and performs the following
    • Returns the character at 5th position and display it.
    • Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
    • Concatenates “- Let us learn” to the above string and display it.
    • Returns the position of the first occurrence of character ‘a’ and display it.
    • Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
    • Returns string between 4th position and 10th position and display it.
    • Returns the lowercase of the string and display it. */

public class Assignment7 {
    public static void main(String[] args) {
        String s="Welcome to Java World";
        System.out.println(s);
        System.out.println(s.charAt(4));
        System.out.println(s.equalsIgnoreCase("Welcome"));
        System.out.println(s.concat(" - Let us learn"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.replace('a', 'e'));
        System.out.println(s.substring(4, 10));
        System.out.println(s.toLowerCase());
    }    
}
