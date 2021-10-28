package core_java_Lab_o2;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabaticalSort {

	public static void main(String[] args) {    // sort by alphabhet
		AlphabaticalSort.sortStrings();
	}

	public static void sortStrings() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		// Declare array size
		int n;
		System.out.print("Enter number of elements : ");
		// Initialize array size
		n = sc.nextInt();

		String arr[] = new String[n];
		System.out.println("Enter the String : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc1.nextLine();
		}

		Arrays.sort(arr); // Sort the array in alphabetical order

		System.out.println(Arrays.toString(arr)); // Display the array
		sc.close();
		sc1.close();
	}
}
