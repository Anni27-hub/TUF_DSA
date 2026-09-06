/*
Platform: TakeuForward Plus (TUF+)
Problem Name: Automorphic Number
URL: https://takeuforward.org/plus/dsa/problems/automorphic-number
Submitted Date: 2026-09-06
Repository: Anni27-hub/TUF_DSA
*/

class Solution {
    public boolean isAutomorphic(int n) {
        int square = n * n;
        while (n > 0) {
            if (n % 10 != square % 10)
                return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }
}
