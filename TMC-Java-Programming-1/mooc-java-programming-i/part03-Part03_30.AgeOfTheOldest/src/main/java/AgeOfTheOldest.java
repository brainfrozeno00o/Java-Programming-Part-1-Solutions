
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            
            String[] splitValues = value.split(",");
            if (Integer.valueOf(splitValues[1]) > oldest){
                oldest = Integer.valueOf(splitValues[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
