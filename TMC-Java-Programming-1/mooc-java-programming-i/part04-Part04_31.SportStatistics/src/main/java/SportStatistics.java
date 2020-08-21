
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner fs = new Scanner(Paths.get(file))) {
            ArrayList<String> homeTeam = new ArrayList();
            ArrayList<String> awayTeam = new ArrayList();
            ArrayList<Integer> homeScore = new ArrayList();
            ArrayList<Integer> awayScore = new ArrayList();
            
            while (fs.hasNextLine()) {
                String row = fs.nextLine();
                String[] values = row.split(",");
                
                homeTeam.add(values[0]);
                awayTeam.add(values[1]);
                homeScore.add(Integer.valueOf(values[2]));
                awayScore.add(Integer.valueOf(values[3]));
            }
            
            int teamGames = 0;
            int teamWins = 0;
            int teamLosses = 0;
            
            for(int i = 0; i < homeTeam.size(); i++){
                if( homeTeam.get(i).contains(team) || awayTeam.get(i).contains(team)) {
                    teamGames++;
                    if (homeTeam.get(i).contains(team)) {
                        if (homeScore.get(i) > awayScore.get(i)) {
                            teamWins++;
                        }else {
                            teamLosses++;
                        }
                    } else if (awayTeam.get(i).contains(team)) {
                        if (awayScore.get(i) > homeScore.get(i)) {
                            teamWins++;
                        }else {
                            teamLosses++;
                        }                        
                    }
                }
            }
            
            System.out.println("Games: " + teamGames);
            System.out.println("Wins: " + teamWins);
            System.out.println("Losses: " + teamLosses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
