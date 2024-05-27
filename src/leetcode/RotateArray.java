package leetcode;

import java.util.Scanner;

public class RotateArray {

	private static Scanner scan = new Scanner(System.in);

	public RotateArray() {
	}

	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();

		int[] nums = new int[size];
		System.out.println("Enter Numbers : ");

		for (int i = 0; i < size; i++) {
			System.out.print("nums[" + (i + 1) + "] : ");
			nums[i] = scan.nextInt();
		}

		System.out.println("Enter value to rotate the array : ");
		int k = scan.nextInt();

		int[] result = rotateArray(nums, k, size);
		for (int n : result)
			System.out.print(n + " ");
	}

	public static int[] rotateArray(int[] nums, int k, int size) {

		int[] reverseArray = new int[size];
		for (int i = 0; i < k; i++) {
			reverseArray = leftShiftArray(nums);
		}

		return reverseArray;
	}

	public static int[] leftShiftArray(int[] nums) {

		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = temp;
		return nums;
	}

}
