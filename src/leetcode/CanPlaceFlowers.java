/*
 
605. Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot 
be planted in adjacent plots. Given an integer array flowerbed containing 0's and 1's, where 0 means empty 
and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed 
without violating the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 
 */

package leetcode;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		System.out.println(canPlaceFlowers(new int[] {0}, 1));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	       int counter = 0;
			if(flowerbed.length > 1) {
				for(int i=0; i<flowerbed.length; i++) {
					if(i == 0)
						if((flowerbed[i] == 0) && (flowerbed[i+1] == 0)) {
							counter++;
							flowerbed[i] = 1;
						}
					
					if(i == flowerbed.length-1) {
						if((flowerbed[i] == 0) && (flowerbed[i-1] == 0)) {
							counter++;
							flowerbed[i] = 1;
						}
					}
					
					if((flowerbed[i] == 0) && (flowerbed[i-1] == 0) && (flowerbed[i+1] == 0)){
						counter++;
						flowerbed[i] = 1;
					}
				}
				return (counter >= n) ? true : false;
			}
			else{
				if((flowerbed[0] == 0) && (n >= 1))
					return true;
				else if((flowerbed[0] == 1) && (n == 0))
					return true;
	            else if((flowerbed[0] == 1) && (n >= 1))
					return false;
	            else 
					return false;
			}
	    }

}
