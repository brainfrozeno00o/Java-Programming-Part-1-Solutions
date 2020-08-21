
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;   
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String addTask = scanner.nextLine();
                this.list.add(addTask);
            } else if (command.equalsIgnoreCase("list")) {
                this.list.print();
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.list.remove(number);
            } else if (command.equalsIgnoreCase("stop")) {
                break;
            }
        }
    }
}
