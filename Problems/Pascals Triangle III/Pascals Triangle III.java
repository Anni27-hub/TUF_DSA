/*
Platform: TakeuForward Plus (TUF+)
Problem Name: Pascals Triangle III
URL: https://takeuforward.org/plus/dsa/problems/pascals-triangle-iii
Submitted Date: 2026-09-05
Repository: Anni27-hub/TUF_DSA
*/

import java.util.*;
class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        // Generate all rows
        for (int row = 0; row < n; row++) {
            List<Integer> temp = new ArrayList<>();
            long val = 1;
            // First element always 1
            temp.add(1);
            // Generate remaining elements
            for (int col = 1; col <= row; col++) {
                val = val * (row - col + 1) / col;
                temp.add((int) val);
            }
            // Add row to answer
            ans.add(temp);
        }
        return ans;
    }
}
