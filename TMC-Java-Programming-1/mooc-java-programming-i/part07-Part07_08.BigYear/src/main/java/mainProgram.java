
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equalsIgnoreCase("Quit")) {
                break;
            }
            
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: "); 
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                
                birds.add(new Bird(name, latinName));
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                
                boolean foundBird = false;
                for (Bird b : birds) {
                    if (b.getName().equalsIgnoreCase(bird)) {
                        foundBird = true;
                        b.birdObserved();
                    }
                }
                
                if (!foundBird) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            } else if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                
                boolean foundBird = false;
                for (Bird b : birds) {
                    if(b.getName().equalsIgnoreCase(bird)){
                        foundBird = true;
                        System.out.println(b);
                        break;
                    }
                }
                
                if (!foundBird) {
                    System.out.println("Not a bird!");
                }
            }
        }

    }

}
