
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class UserInterface {
    private Grades grades;
    private Scanner scanner;
    
    public UserInterface(Grades grades, Scanner scanner){
        this.grades = grades;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1){
                break;
            }
            grades.addPoints(point);
        }
        
        double pointAverage = grades.showPointAverage();
        double passingPointAverage = grades.showPassingPointAverage();
        double passPercentage = grades.showPassPercentage();
        int[] gradeDistribution = grades.getGradeDistribution();
        
        if (pointAverage == 0.0){
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): " + pointAverage);
        }
        
        if (passingPointAverage == 0.0){
            System.out.println("Point average (passing): -");            
        } else {
            System.out.println("Point average (passing): " + passingPointAverage);
        }
        
        System.out.println("Pass percentage: " + passPercentage);
        
        if(gradeDistribution != null) {
           System.out.println("Grade Distribution: ");

           for(int i = gradeDistribution.length - 1; i >= 0; i--) {
               System.out.print(i + ": ");
               printStars(gradeDistribution[i]);
               System.out.println("");
           }           
        }
        
    }
    
    public void printStars(int length) {
        for(int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
