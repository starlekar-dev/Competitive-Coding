package hackerrank;

import java.util.Scanner;

public class ElevatorButtons {

	static Scanner scan = new Scanner(System.in);
	public ElevatorButtons() {}

	
	public static int getDirection() {
		int direction=0;	
		System.out.println("Enter Direction of Elevator (1 for upward and -1 for downward) :");
		
		try {
			int num = scan.nextInt();
			scan.nextLine();
			if (num == -1 || num == 1)
				direction = num;
			else
				throw new IllegalArgumentException("Input must be either -1 or 1.");
		}		
		catch(Exception e) {
			System.err.println("Invalid Input : " +e.getMessage());
			System.exit(1);
		}
		finally {
			scannerClose();
		}		
		System.out.println(direction);
		return direction;
	}
	public static int getCurrentFloor() {
		int currentFloor = 0;
		scan.nextLine();
		System.out.println("Enter Current Floor (0 to 1000) : ");
		
		try {
			int num = scan.nextInt();
			if(num>=0 && num<=1000)
				currentFloor = num;
			else
				throw new IllegalArgumentException("Input must be between 0 and 1000(Inclusive)");
		}
		catch(Exception e) {
			System.err.println("Invalid Input : " +e.getMessage());
		}
		finally {
			scannerClose();
		}
		return currentFloor;
	}
	
	
	public static void main(String[] args) {

		int direction = getDirection();
		int currentFloor = getCurrentFloor();
	}

	static void scannerClose() {
		scan.close();
	}
}
