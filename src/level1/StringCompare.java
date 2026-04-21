import java.util.Scanner;

public class StringCompare {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        boolean result = compareStrings(str1, str2);

        System.out.println("Using charAt(): " + result);
        System.out.println("Using equals(): " + str1.equals(str2));

        input.close();
    }
}