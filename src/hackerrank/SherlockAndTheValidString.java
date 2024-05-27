/*

Sherlock considers a string to be valid if all characters of the string appear the same number of times. 
It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur 
the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.

Example

s=abc
This is a valid string because frequencies are .
{a:1, b:1, c:1}


s=abcc
This is a valid string because we can remove one  and have  of each character in the remaining string.


s=abccc
This string is not valid as we can only remove  occurrence of . That leaves character frequencies of .
{a:1, b:1, c:2}

Function Description

Complete the isValid function in the editor below.

isValid has the following parameter(s):

string s: a string
Returns

string: either YES or NO
Input Format

A single string .

Each character 
Sample Input
aabbcd

Sample Output
NO


 */

package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {

	public static void main(String[] args) {
		System.out.println(isValid("abcc"));
	}

	public static String isValid(String s) {

		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		Map<Integer, Integer> freqCount = new HashMap<>();
		for (int count : charCount.values()) {
			freqCount.put(count, freqCount.getOrDefault(count, 0) + 1);
		}

		if (freqCount.size() == 1) {
			return "YES";
		}

		if (freqCount.size() == 2) {
			Object[] keys = freqCount.keySet().toArray();
			int key1 = (int) keys[0];
			int key2 = (int) keys[1];
			if ((key1 == 1 && freqCount.get(key1) == 1) || (key2 == 1 && freqCount.get(key2) == 1)) {
				return "YES";
			}
			if (Math.abs(key1 - key2) == 1 && (freqCount.get(key1) == 1 || freqCount.get(key2) == 1)) {
				return "YES";
			}
		}
		return "NO";
	}

}
