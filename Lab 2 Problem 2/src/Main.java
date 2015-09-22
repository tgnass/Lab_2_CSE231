import java.util.Scanner;


/**
 *
 * @author Tyler
 */
public class Main {

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
        Population population = new Population();
        population.displayPopulation(startingOrganisms, increase, days);
    }    
}
