
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String message = scan.nextLine();
        System.out.println("Give an integer:");
        int number1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double number2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + number1);
        System.out.println("You gave the double " + number2);
        System.out.println("You gave the boolean " + value);
    }
}
