public class ExceptionDemo {

    // Method to generate exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // NullPointerException
    }

    // Method to handle exception
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("Handling Exception:");
        handleException();

        // Uncomment to see crash
        // generateException();
    }
}