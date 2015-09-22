/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgnas_000
 */
public class Ackermann {

    
    public Ackermann() {

    }
    
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
