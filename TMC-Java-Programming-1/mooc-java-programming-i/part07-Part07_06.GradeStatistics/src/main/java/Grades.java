
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john.lingad
 */
public class Grades {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passedPoints;
    
    public Grades() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
        this.passedPoints = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            this.grades.add(convertPointsToGrade(points));                            
        }
    }
    
    public double showPointAverage() {
        if (!points.isEmpty()) {
            int totalPoints = 0;
            
            for (int point : points) {
                totalPoints += point;
            }
            
            return 1.0 * totalPoints / points.size();
        }
        return 0.0;
    }
    
    public double showPassingPointAverage() {
        if (!points.isEmpty()) {
            for (int point : points) {
                if (point >= 50) {
                    passedPoints.add(point);
                }
            }

            int totalPassedPoints = 0;
            
            if (!passedPoints.isEmpty()) {
                for (int passedPoint : passedPoints) {
                    totalPassedPoints += passedPoint;
                }

                return 1.0 * totalPassedPoints / passedPoints.size();                
            }
        }
        return 0.0;
    }
    
    public double showPassPercentage() {
        if (!passedPoints.isEmpty()) {
           return 100.0 * passedPoints.size() / points.size();           
        }
        return 0.0;
    }
    
    public int convertPointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if(points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else if (points >= 90) {
            return 5;
        }
        return -1;
    }
    
    public int[] getGradeDistribution() {
        if (!grades.isEmpty()) {
            int[] gradesArray = {0, 0, 0, 0, 0, 0};
            
            for(int grade: grades) {
                gradesArray[grade]++;
            }
            
            return gradesArray;
        }
        return null;
    }
}
