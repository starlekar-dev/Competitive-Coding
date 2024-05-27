package leetcode;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
	
	
	public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new TreeMap<>();
        for(int i=0; i<nums.length / 2; i++) {
        	if(!elements.containsKey(nums[i])) {
        		int counter = 1;
            	for(int j = i+1; j<nums.length; j++) {
            		if(nums[i] == nums[j])
            			counter++;
            	}
            	elements.put(nums[i], counter);
        	}
        }
        
        int max = Integer.MIN_VALUE;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry : elements.entrySet()) {
        	int value = entry.getValue();
        	if(value > max) {
        		max = value;
        		key = entry.getKey();
        	}
        }

        return key;
    }

}
