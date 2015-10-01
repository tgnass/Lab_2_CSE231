import java.math.BigInteger;


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
        
        BigInteger factorialNumber = factorial(new BigInteger("6"));
        System.out.println("Result of 6! : " + factorialNumber);
        System.out.println("Sum of the digits: " + addDigits(factorialNumber));
    }
    
    private static int addDigits(BigInteger sum) {
        int total = 0;
        String digits = sum.toString();
        
        for(int i = 0; i < digits.length(); i++) {
            int digit = (int)(digits.charAt(i) - '0');
            total = total + digit;
        }
        
        return total;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static BigInteger factorial(BigInteger n) {
        
        BigInteger returnValue;
        
        if (n.intValue() == 0)
            returnValue = BigInteger.ONE;
        else
            returnValue = (n.multiply(factorial(n.subtract(BigInteger.ONE))));
        
        return returnValue;        
    }    
}