class Solution {
  public int[] plusOne(int[] digits) {
    digits[digits.length - 1]++;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] == 10 && i != 0) {
        digits[i] = 0;
        digits[i - 1] = digits[i - 1] + 1;
      } else if (i == 0 && digits[0] == 10) {
        int digitPlusOne[] = new int[digits.length + 1];
        digitPlusOne[0] = 1;
        return digitPlusOne;
      }
    }
    return digits;
  }
}

/*
 * TESTCASE: [2,9,9] Iteration 1: 2,10,0 iteration 2: 3,0,0
 * 
 * TESTCASE: [9,9,9] Iteration 1: [9,10,0] Iteration 2: [1,0,0,0]
 * 
 * => O(1) = O(1)
 */