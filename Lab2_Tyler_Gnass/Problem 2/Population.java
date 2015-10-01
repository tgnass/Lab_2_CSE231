/*
‘LAB #2
‘Fall 2015
‘Tyler Gnass
‘I fully understand the following statement.
‘OU PLAGIARISM POLICY
‘All members of the academic community at Oakland are expected to practice and uphold ‘standards of academic integrity and honesty. 
An instructor is expected to inform and instruct ‘students about the procedures and standards of research and documentation required of students 
‘in fulfilling course work. A student is expected to follow such instructions and be sure the rules ‘and procedures are understood in order to avoid 
inadvertent misrepresentation of his work. ‘Students must assume that individual (unaided) work on exams and lab reports and documentation ‘of sources 
is expected unless the instructor specifically says that is not necessary.

‘The following definitions are some examples of academic dishonesty:
 ‘Plagiarizing from work of others. Plagiarism is using someone else's work or ideas without ‘giving the other person credit; by doing this, 
a student is, in effect, claiming credit for ‘someone else's thinking. Whether the student has read or heard the information he uses, ‘the student 
must document the source of information. When dealing with written sources, ‘a clear distinction would be made between quotations (which reproduce 
information from ‘the source word-for-word within quotation marks) and paraphrases (which digest the ‘source information and produce it in the student's 
own words). Both direct quotations and ‘paraphrases must be documented. Just because a student rephrases, condenses or selects ‘from another person's 
work, the ideas are still the other person's, and failure to give ‘credit constitutes misrepresentation of the student's actual work and plagiarism of 
‘another's ideas. Naturally, buying a paper and handing it in as one's own work is ‘plagiarism.
 ‘Cheating on lab reports falsifying data or submitting data not based on student's own work.
*/

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
    
    /**
     *
     * @param startingOrganisms
     * @param increase
     * @param days
     */
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
