import java.util.Scanner;

// Program to Check Vowel or Consonant

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a Vowel.");
                default -> System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Error: Please enter a valid alphabetic character.");
        }
    }
}