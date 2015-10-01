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
        Ackermann ackermann = new Ackermann();
        System.out.println("Ackermann(0, 0) = " + ackermann.solve(0, 0));
        System.out.println("Ackermann(0, 1) = " + ackermann.solve(0, 1));
        System.out.println("Ackermann(1, 1) = " + ackermann.solve(1, 1));
        System.out.println("Ackermann(1, 2) = " + ackermann.solve(1, 2));
        System.out.println("Ackermann(1, 3) = " + ackermann.solve(1, 3));
        System.out.println("Ackermann(2, 2) = " + ackermann.solve(2, 2));
        System.out.println("Ackermann(3, 2) = " + ackermann.solve(3, 2));
    }
    
}
