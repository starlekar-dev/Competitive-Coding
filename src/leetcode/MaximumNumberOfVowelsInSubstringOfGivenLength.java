/*
 
Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring 
of s with length k. Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2:
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3:
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */

package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {

	public static void main(String[] args) {
		System.out.println(maxVowels("weallloveyou", 7));
	}

	public static int maxVowels(String s, int k) {

		String vowelPattern = "[aeiou]";
		Pattern pattern = Pattern.compile(vowelPattern);
		int max = 0;
		for (int i = 0; i <= s.length() - k; i++) {
			int counter = 0;
			String str = s.substring(i, i+k);
			Matcher matcher = pattern.matcher(str);
			while(matcher.find())
				counter++;
			if(max < counter)
				max = counter;
		}
		return max;
	}

}
