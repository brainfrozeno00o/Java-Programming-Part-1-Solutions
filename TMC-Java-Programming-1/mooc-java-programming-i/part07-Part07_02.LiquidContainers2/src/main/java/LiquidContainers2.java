
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            System.out.println();
            
            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equalsIgnoreCase("add")) {
                firstContainer.add(amount);
            } else if (command.equalsIgnoreCase("move")) {
                if(firstContainer.contains() > 0) {
                    if(amount > firstContainer.contains()) {
                        secondContainer.add(firstContainer.contains());
                    } else {
                        secondContainer.add(amount); 
                    }
                    firstContainer.remove(amount);                  
                }
            } else if (command.equalsIgnoreCase("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}
