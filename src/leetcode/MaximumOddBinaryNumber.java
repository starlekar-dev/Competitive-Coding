package leetcode;

public class MaximumOddBinaryNumber {

	public static void main(String[] args) {
		
		System.out.println(maximumOddBinaryNumber("010"));
	}
	
	
	public static String maximumOddBinaryNumber(String s) {

		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		
		char[] result = new char[s.length()];
		for(int i=0; i<result.length; i++) {
			if(count > 1) {
				result[i] = '1';
				count--;
			}
			else if (i == result.length-1){
				result[i] = '1';
			}
			else
			{
				result[i] = '0';
			}
		}
		
		return new String(result);
	}
	
	

}
