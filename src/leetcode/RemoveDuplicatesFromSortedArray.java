package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
		
	}

	
	public static int removeDuplicates(int[] nums) {
		Set<Integer> unique = new TreeSet<Integer>();
		for(int n : nums)
			unique.add(n);
		int count = 0;
		Iterator<Integer> itr = unique.iterator();
		while(itr.hasNext()) {
			nums[count++] = itr.next();
		}
		return unique.size();
    }
	
}
