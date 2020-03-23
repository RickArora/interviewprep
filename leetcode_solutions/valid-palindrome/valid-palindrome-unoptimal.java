import java.util.Arrays;

class Solution {
  public boolean isPalindrome(String s) {
    StringBuilder str = new StringBuilder();
    s = s.toLowerCase();
    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        str.append(c);
      }
    }
    StringBuilder strReverse = str.reverse();
    return str.toString().equals(str.reverse().toString());
  }
}

// unOptimal b/c we used O(n) space , optimal solution uses O(1) additional space.