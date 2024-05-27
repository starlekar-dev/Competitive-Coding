package leetcode;

public class MinimumLengthofStringAfterDeletingSimilarEnds {

	public static void main(String[] args) {
		
		System.out.println(minimumLength("ca"));
	}

	public static int minimumLength(String s) {
		int preCount = 0, sufCount = 0;
		StringBuilder sb = new StringBuilder(s);
		char prefixChar = ' ';
		char suffixChar = ' ';

//		while (sb.length() > 0) {
			for (int i = 0; i < s.length(); i++) {
				prefixChar = s.charAt(i);
				System.out.println(prefixChar);
			}
			for (int i = s.length() - 1; i >= 0; i--) {
				suffixChar = s.charAt(i);
				System.out.println(suffixChar);
			}

			if (prefixChar == suffixChar)
				sb.substring(preCount, sufCount + 1);
//		}
		return sb.length();

	}

}
