import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 8;
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        char[] wordArray = word.toCharArray();
        char[] hiddenWord = new char[word.length()];
        Arrays.fill(hiddenWord, '_');


        System.out.println("Welcome to Hangman!");
        while(tries > 0 || !Arrays.equals(wordArray, hiddenWord)) {
            System.out.println("You have " + tries + " tries left.");
            System.out.println("Guess a letter: ");
            String guess = scanner.nextLine();
            if (word.contains(guess)) {
                System.out.println("Correct!");
                for (int i = 0; i < word.length(); i++) {
                    if (wordArray[i] == guess.charAt(0)) {
                        hiddenWord[i] = guess.charAt(0);
                    }
                }
                System.out.println(hiddenWord);
                if(Arrays.equals(hiddenWord, wordArray)) {
                    System.out.println("You win!");
                    break;
                }
            } else {
                System.out.println("Wrong!");
                tries--;
            }
        }
    }
}
