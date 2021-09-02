import java.util.Scanner;

public class CountingTheNumberOfCharacters {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(word + " has " + word.length() + " characters.");
    }
}
