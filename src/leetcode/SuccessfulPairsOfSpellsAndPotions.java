/*
 
2300. Successful Pairs of Spells and Potions

You are given two positive integer arrays spells and potions, of length n and m respectively, 
where spells[i] represents the strength of the ith spell and potions[j] represents the strength 
of the jth potion. You are also given an integer success. A spell and potion pair is considered 
successful if the product of their strengths is at least success. Return an integer array pairs 
of length n where pairs[i] is the number of potions that will form a successful pair with the ith 
spell.

Example 1:
Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
Thus, [4,0,3] is returned.

Example 2:
Input: spells = [3,1,2], potions = [8,5,8], success = 16
Output: [2,0,2]
Explanation:
- 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
- 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful. 
- 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful. 
Thus, [2,0,2] is returned.
 
 */

package leetcode;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(successfulPairs(new int[] {5,1,3}, new int[] {1,2,3,4,5}, 7)));
	}

	public static int[] successfulPairs(int[] spells, int[] potions, long success) {

//		int[] successfulPairs = new int[spells.length];
//		for(int i=0; i<spells.length; i++) {
//			int product = 0;
//			int counter = 0;
//			for(int j=0; j<potions.length; j++) {
//				product = spells[i] * potions[j];
//				if(product >= success)
//					counter++;
//			}
//			successfulPairs[i] = counter;
//		}
//		return successfulPairs;
		
		
		
//		Arrays.sort(potions);
//		int[] successfulPairs = new int[spells.length];
//		for(int i=0; i<spells.length; i++) {
//			int low = 0;
//			int high = potions.length - 1;
//			while(low <= high) {
//				int mid = low + (high - low) / 2; 
//				if((long)(spells[i] * potions[mid]) >= success )
//					high = mid - 1;
//				else
//					low = mid + 1;
//			}
//			successfulPairs[i] = potions.length - low; 
//		}
//		return successfulPairs;
		
		
		Arrays.sort(potions);
        int[] successfulPairs = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int left = 0, right = potions.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            successfulPairs[i] = potions.length - left; 
        }

        return successfulPairs;
	}
}
