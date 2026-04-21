import java.util.Scanner;

public class StringSplitManual {

    // Method to split string manually
    public static String[] splitText(String text) {

        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];

        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        words[index] = temp;

        return words;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        String[] result = splitText(text);

        System.out.println("Words:");
        for (String word : result) {
            System.out.println(word);
        }

        input.close();
    }
}