/*
Platform: TakeuForward Plus (TUF+)
Problem Name: Count The Number Of Words In A Given Strin
URL: https://takeuforward.org/plus/dsa/problems/count-the-number-of-words-in-a-given-strin
Submitted Date: 2026-09-06
Repository: Anni27-hub/TUF_DSA
*/

class Solution {
    public int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' &&
            //Current character is not a space, and either it is the first character or the character before it is a space.
                (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
