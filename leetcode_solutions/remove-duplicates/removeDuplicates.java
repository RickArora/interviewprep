class Solution {
public int removeDuplicates(int[] nums) {
       int index = 1; // set index to one since there will be atleast 1 unique element 
       for (int i = 0; i < nums.length - 1; i++) { // iterate through all values of 
            if(nums[i] != nums[i+1]) { // checks if the current number and the next number is the same, if it is not then we execute whats in the {}
                nums[index++] = nums[i+1]; // sets nums[index] = nums[i+1], then index = index + 1
                // the purpose of this is to set the unique number to the index'th element 
            }
       }
        return index; // returns the index
    }
}

/* TESTCASE
Input: [1,2,3,3,4,4,5]
Iteration 1:
Index = 1 , if statement will be triggered, nums[1] = 2, num=1,2,...
Iteration 2: index = 2 if statement triggered nums[2] = 3, num = 1,2,3,... , i = 1
Iteration 3: if condition not triggered, i = 2, num = 1,2,3,... ,
iteration 4: if condition triggered, i = 3 num = 1,2,3,4 index = 4 , num[4] = 4 
iteration 5: if condition not triggered, i = 4
Iteration 6: if condition triggered, i = 5 
...
nums=[1,2,3,4,5,...] index = 5  
*/ 