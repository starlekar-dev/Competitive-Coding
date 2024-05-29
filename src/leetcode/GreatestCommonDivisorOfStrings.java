/*

 1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with 
itself one or more times). Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""

 */


package leetcode;

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABABAB", "ABAB"));
	}
	
    public static String gcdOfStrings(String str1, String str2) {
    	
    	if(str2.length() > str1.length())
    		return "";
    	String gcd = "";
    	return "";
    }

}
