
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumBirthYears = 0;
        int values = 0;
        int longestNameLength = 0;
        String longestName = "";
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            
            String[] splitValues = value.split(",");
            if (splitValues[0].length() > longestNameLength){
                longestNameLength = splitValues[0].length();
                longestName = splitValues[0];
            }
            values++;
            sumBirthYears += Integer.valueOf(splitValues[1]);
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumBirthYears / values));
    }
}
