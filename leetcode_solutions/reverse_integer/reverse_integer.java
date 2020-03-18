class Solution {
    public int reverse(int x) { // declaring method reverse which takes an int parameter
        long result = 0; // setting result to 0 and a long
        while(x != 0) { // while x != 0, this loop will execute
            int digit = x % 10; // getting the last digit from the input, x
            result = result * 10; //  multiplying the current result by 10
            result += digit; // appending the latest isolated digit to result
            x = x / 10; // removing the last digit from x
        }
        if((-1*(1 << 31)) > result || result > ((1<<31)-1)) { // checking if result is in between -2^31 & 2^31 - 1
             return 0; // return 0 if it is
        }
        return (int) result; // cast result to an int
    }
}