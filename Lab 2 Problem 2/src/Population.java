import java.util.Scanner;


/**
 *
 * @author Tyler
 */
public class Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner organismInput = new Scanner(System.in);
        System.out.print("Enter the starting number organisms: ");
        double startingOrganisms = organismInput.nextDouble();
        Scanner dailyInput = new Scanner(System.in);
        System.out.print("Enter the daily increase: ");
        double increase = dailyInput.nextDouble();
        Scanner daysInput = new Scanner(System.in);
        System.out.print("Enter the number of days the organisms will multiply: ");
        int days = daysInput.nextInt();
        System.out.println("Days\t\tOrganisms");
        System.out.println("-----------------------------------");
        displayPopulation(startingOrganisms, increase, days);
    }
    
    public static void displayPopulation(double startingOrganisms, double increase, int days) {
        showPopulation(1, days, startingOrganisms, increase);
        
    }   
    
    private static void showPopulation(int dayNum, int days, double organisms, double dailyIncrease) {
        if((dayNum <= days) && (organisms > 2) && (dailyIncrease > 0) && (days >= 1)) {
            int dayIncrease = dayNum + 1;
            System.out.println(dayNum + "\t\t" + organisms);
            organisms += organisms * (dailyIncrease / 100);
            showPopulation(dayIncrease, days, organisms, dailyIncrease);
        }
    }
}
