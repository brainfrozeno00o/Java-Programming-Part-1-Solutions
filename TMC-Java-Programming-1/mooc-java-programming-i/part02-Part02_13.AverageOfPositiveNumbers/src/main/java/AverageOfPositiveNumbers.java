
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                sum = sum + number;
                numbers = numbers + 1;
            } else if (number == 0) {
                break;
            }
        }
        if (numbers > 0) {
            System.out.println(1.0 * sum / numbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
