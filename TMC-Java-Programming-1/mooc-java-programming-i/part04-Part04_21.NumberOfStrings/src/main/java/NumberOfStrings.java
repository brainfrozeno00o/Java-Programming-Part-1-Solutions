
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strings = 0;
        
        while(true){
            String value = scanner.nextLine();
            if(value.equals("end")){
                break;
            }
            strings++;
        }
        System.out.println(strings);
    }
}
