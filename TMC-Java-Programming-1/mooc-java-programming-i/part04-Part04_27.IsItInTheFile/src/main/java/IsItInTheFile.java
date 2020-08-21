
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fs = new Scanner(Paths.get(file))) {
            boolean isNameFound = false;
            while(fs.hasNextLine()){
                String row = fs.nextLine();
                if(row.contains(searchedFor)){
                    isNameFound = true;
                    break;
                }
            }
            
            if(isNameFound){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
    }
}
