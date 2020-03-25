class Solution {
  public int maxProfit(int[] prices) {
    int max = 0; // set default max price to 0
    int min = Integer.MAX_VALUE; // sets the minimum value to max integer
    for (int i = 0; i < prices.length; i++) { // iterates through the length of prices
      if (prices[i] < min) { // if prices[i] < min we set min = prices[i]
        min = prices[i];
      } else { // else we calculate the max between the previous max profit and the sum of the currentindex - lowest index we saw so far
        max = Math.max(max, prices[i] - min);
      }
    }
    return max;
  }
}

/*
 * test cases [7,4,8] init: max = 0, min = max int value 
 * Iter 1: min = 7
 * Iter 2: min = 4
 * iter 3: min = 8-4=4 which is the correct answer
 * 
 * The intuition behind this algorithim is as follows:
 * We check to see if the current value is the lowest we encountered in the array thus far, if it is we set min to it
 * OR IF
 * max < (price of our current index - min) then we give our max a new value. 
 */