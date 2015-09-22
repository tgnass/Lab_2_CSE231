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
    public int Solve(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        
        if (n == 0) {
            return Solve(m - 1, 1);
        }
        
        return Solve(m - 1, Solve(m, n - 1));
    }
}
