                                                                                                                                       
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitValues = value.split(" ");
            for(String i : splitValues){
                System.out.println(i);
            }
        }
        
        
    }
}
