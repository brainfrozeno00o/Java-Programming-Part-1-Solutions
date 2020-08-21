
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestPerson = "";
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            
            String[] splitValues = value.split(",");
            if (Integer.valueOf(splitValues[1]) > oldest){
                oldest = Integer.valueOf(splitValues[1]);
                oldestPerson = splitValues[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
