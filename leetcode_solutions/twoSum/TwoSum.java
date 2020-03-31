import java.util.*;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      hashmap.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      if (hashmap.containsKey(target - nums[i]) && hashmap.get(target - nums[i]) != i) {
        return new int[] { hashmap.get(target - nums[i]), i };
      }
    }
    return new int[] { -1 };
  }
}