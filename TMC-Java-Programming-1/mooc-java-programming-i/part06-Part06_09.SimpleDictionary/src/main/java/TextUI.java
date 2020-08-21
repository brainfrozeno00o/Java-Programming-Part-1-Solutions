
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
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("To be translated: ");
                String searchWord = scanner.nextLine();
                String result = this.dictionary.translate(searchWord);
                if (result != null) {
                    System.out.println("Translation: " + result);
                } else {
                    System.out.println("Word " + searchWord + " was not found");
                }
            }else {
                System.out.println("Unknown command");               
            }
        }
    }
}
