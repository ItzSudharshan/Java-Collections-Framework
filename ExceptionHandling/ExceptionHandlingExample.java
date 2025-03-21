import java.util.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException (division by zero)
        } catch (ArithmeticException e) {
            System.out.println("Exception has occurred: " + e.getMessage()); // Prints: "/ by zero"
        }
    }
}
