import java.util.Scanner;

public class SubstringManual {

    // Method to create substring using charAt
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String manual = createSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring: " + builtIn);

        input.close();
    }
}