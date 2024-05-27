/*
 
 238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the 
elements of nums except nums[i]. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit 
integer. You must write an algorithm that runs in O(n) time and without using the division operation.

 
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
 */


package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
	}
	
    public static int[] productExceptSelf(int[] nums) {
        
//    	int[] sums = new int[nums.length];
//    	for(int i=0; i<nums.length; i++) {
//    		int sum = 1;
//    		for(int j=0; j<nums.length; j++) {
//    			if (j != i)
//    				sum *= nums[j];
//    		}
//    		sums[i] = sum;
//    	}
//    	return sums;
    	
    	
    	 int n = nums.length;
         int[] answer = new int[n];
         Arrays.fill(answer, 1);
         int prefix = 1;
         for (int i = 0; i < n; i++) {
             answer[i] = prefix;
             prefix *= nums[i];
         }
         int suffix = 1;
         for (int i = n - 1; i >= 0; i--) {
             answer[i] *= suffix;
             suffix *= nums[i];
         }

         return answer;
    	
    	
    	
    }

}
