
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fs = new Scanner(Paths.get(file))) {
            while(fs.hasNextLine()){
                String row = fs.nextLine();
                String[] values = row.split(",");
                
                System.out.println(values[0] + ", age: " + values[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
