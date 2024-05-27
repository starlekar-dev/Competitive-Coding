package leetcode;

import java.util.Arrays;
import java.util.Set;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(sortedSquares(nums)));
		
	}
	
	public static int[] sortedSquares(int[] nums) {
        Integer[] result = new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i] * nums[i];
        }
        return nums;
    }

}
