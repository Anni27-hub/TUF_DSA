/*
Platform: TakeuForward Plus (TUF+)
Problem Name: Remove All Duplicates From A String
URL: https://takeuforward.org/plus/dsa/problems/remove-all-duplicates-from-a-string
Submitted Date: 2026-09-06
Repository: Anni27-hub/TUF_DSA
*/

class Solution {
    public String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == -1) {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
