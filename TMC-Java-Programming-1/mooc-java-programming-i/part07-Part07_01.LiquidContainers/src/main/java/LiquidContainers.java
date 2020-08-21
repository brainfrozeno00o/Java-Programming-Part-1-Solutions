
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            System.out.println();
            
            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equalsIgnoreCase("add")) {
                if (amount < 0){
                    continue;
                }
                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                } else {
                    firstContainer = 100;
                }
            } else if (command.equalsIgnoreCase("move")) {
                if(amount < 0 || firstContainer == 0){
                    continue;
                }
                
                if (firstContainer - amount < 0){
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else {
                    secondContainer += amount;
                    firstContainer -= amount;
                }
                
                if(secondContainer > 100) {
                    secondContainer = 100;
                }
            } else if (command.equalsIgnoreCase("remove")) {
                if (amount < 0 || secondContainer == 0){
                    continue;
                }
                
                if(secondContainer - amount < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }
        }
    }

}
