
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgnas_000
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
        displayPopulation(startingOrganisms, increase, days);
    }
    
    /**
     *
     * @param startingOrganisms
     * @param increase
     * @param days
     */
    public static void displayPopulation(double startingOrganisms, double increase, int days) {
        
    }
    
    private static void showPopulation(int dayNum, int days, double organisms, double dailyIncrease) {
        
    }
    
}
