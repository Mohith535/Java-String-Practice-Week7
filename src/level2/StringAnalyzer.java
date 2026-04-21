import java.util.Scanner;

public class StringAnalyzer {

    // Method to analyze string
    public static void analyze(String text) {

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        analyze(text);

        input.close();
    }
}