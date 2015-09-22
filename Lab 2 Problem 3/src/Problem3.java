
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result of 6! : " + factorial(BigInteger.valueOf(6)));
        System.out.println("Sum of the digits: " + addDigits(BigInteger.ONE));
    }
    
    private static int addDigits(BigInteger sum) {
        return 0;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static BigInteger factorial(BigInteger n) {
        return n;
    }    
}
