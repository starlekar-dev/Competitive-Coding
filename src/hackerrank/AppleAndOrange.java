package hackerrank;

import java.util.List;

public class AppleAndOrange {
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = countFruitsOnHouse(s, t, a, apples);
        int orangeCount = countFruitsOnHouse(s, t, b, oranges);

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    private static int countFruitsOnHouse(int s, int t, int treeLocation, List<Integer> fruits) {
        int count = 0;
        for (int distance : fruits) {
            int fruitPosition = treeLocation + distance;
            if (fruitPosition >= s && fruitPosition <= t) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = List.of(-2, 2, 1);
        List<Integer> oranges = List.of(5, -6);

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

}
