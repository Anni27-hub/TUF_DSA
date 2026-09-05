/*
Platform: TakeuForward Plus (TUF+)
Problem Name: Command Palette
URL: https://takeuforward.org/plus/dsa/problems/pascals-triangle-iii
Submitted Date: 2026-09-05
Repository: Anni27-hub/TUF_DSA
*/

temp.add(1);
            // Generate remaining elements
            for (int col = 1; col <= row; col++) {
                val = val * (row - col + 1) / col;
                temp.add((int) val);
            }
            // Add row to answer
            ans.add(temp);
        }
        return ans;
    }
}
