
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        
        UserInterface ui = new UserInterface(grades, scanner);
        ui.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
