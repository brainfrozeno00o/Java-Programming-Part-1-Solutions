
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitValues = value.split(" ");
            for(String i : splitValues){
                if (i.contains("av")){
                    System.out.println(i);
                }               
            }
        }
    }
}
