package record;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i = 1; i < size; i++){
            for (int j = i - 1; j < size; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twosum1(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size = nums.length;
        for(int i = 0; i < size; i ++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < size ; i ++){
            if (map.get(target - nums[i])!= null) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[]{};
    }

}
