import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String whatToPrint = sc.nextLine();
        if(whatToPrint.equals("everything")){
            for(Book b: books){
                System.out.println(b);
            }
        } else if(whatToPrint.equals("name")){
            for(Book b: books){
                System.out.println(b.getTitle());
            }
        }
    }
}
