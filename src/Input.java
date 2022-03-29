import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Your name: ");
            String nameInput = scanner.nextLine();
            System.out.println("Welcome " + nameInput);
            System.out.println("Float: ");
            float floatInput = scanner.nextFloat();
            System.out.println(floatInput);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e);
        }
    }
}