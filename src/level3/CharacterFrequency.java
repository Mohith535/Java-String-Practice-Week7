import java.util.Scanner;

public class CharacterFrequency {

    // Method to count frequency
    public static int[] getFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        return freq;
    }

    // Method to display frequency
    public static void display(String text, int[] freq) {

        System.out.println("\nCharacter Frequencies:");

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                System.out.println(ch + " → " + freq[ch]);
                freq[ch] = 0; // avoid duplicate printing
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int[] freq = getFrequency(text);

        display(text, freq);

        input.close();
    }
}