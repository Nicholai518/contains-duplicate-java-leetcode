import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // used to store elements in array
        HashSet<Integer> numbers = new HashSet<>();

        // iterate through array
        for (int i = 0; i < nums.length; i++) {

            // we found a duplicate
            if (numbers.contains(nums[i])) {
                return true;
            }

            // otherwise add number (current element) to HashSet
            numbers.add(nums[i]);
        }

        // if we iterate through entire array, return false
        return false;
    }
}
