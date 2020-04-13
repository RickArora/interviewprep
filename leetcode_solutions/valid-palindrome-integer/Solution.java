class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int copyOfx = x;
    int xReversed = 0;
    int temp = 0;

    while (x != 0) {
      xReversed *= 10;
      temp = x % 10;
      xReversed += temp;
      x /= 10;
    }
    return copyOfx == xReversed;
  }
}