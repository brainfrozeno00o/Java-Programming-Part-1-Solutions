
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String value = scanner.nextLine();
        System.out.println("");
        System.out.print(value);
        System.out.print(value);
        System.out.print(value);
    }
}
