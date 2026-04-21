import java.util.Scanner;

public class StringLengthManual {

    // Method to calculate length manually
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end reached
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int manualLength = findLength(text);
        int actualLength = text.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + actualLength);

        input.close();
    }
}