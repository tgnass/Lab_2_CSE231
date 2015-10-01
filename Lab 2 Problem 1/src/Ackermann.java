/**
 *
 * @author Tyler
 */
public class Ackermann {

    /**
     *
     * @param m
     * @param n
     * @return
     */
    public int solve(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        
        if (n == 0) {
            return solve(m - 1, 1);
        }
        
        return solve(m - 1, solve(m, n - 1));
    }
}
