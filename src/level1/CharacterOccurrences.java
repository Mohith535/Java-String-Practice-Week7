import java.util.Scanner;

public class CharacterOccurrences {

    public static int[] findIndexes(String text, char ch) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int j = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.print("Enter character: ");
        char ch = input.next().charAt(0);

        int[] result = findIndexes(text, ch);

        System.out.println("Indexes:");
        for (int i : result) {
            System.out.print(i + " ");
        }

        input.close();
    }
}