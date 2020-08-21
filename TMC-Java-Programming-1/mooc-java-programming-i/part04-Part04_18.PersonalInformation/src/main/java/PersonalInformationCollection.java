
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name: ");
            String first = scanner.nextLine();
            if(first.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String last = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(first, last, idNumber));
        }
        System.out.println("");
        for(PersonalInformation pi : infoCollection){
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
