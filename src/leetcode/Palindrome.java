package leetcode;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int x) {

		int temp = 0, remainder = 0, num=x;

		while (num > 0) {
			remainder = num % 10;
			temp = temp * 10 + remainder;
			num = num / 10;
		}
		
		if (temp == x)
			return true;
		return false;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Input : ");
		int x = scan.nextInt();
		if (isPalindrome(x))
			System.out.println(x + " is a Palindrome.");
		else
			System.out.println(x + " is not a Palindrome.");

	}
}

/*
 * 
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left. Example 2:
 * 
 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * 
 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome.
 * 
 * 
 * Constraints:
 * 
 * -231 <= x <= 231 - 1
 * 
 * 
 * Follow up: Could you solve it without converting the integer to a string?
 * 
 */

/*
 * 
 * If input is string then following code is useful.
 * 
 * public boolean isPalindrome(int x){
 * 
 * String str = String.valueOf(x);
 * 
 * int left = 0, right = str.length()-1;
 * 
 * while(left < right) { if(str.charAt(left) != str.charAt(right)) { return
 * false; } left++; right--; }
 * 
 * 
 * return true; }
 * 
 * 
 */
