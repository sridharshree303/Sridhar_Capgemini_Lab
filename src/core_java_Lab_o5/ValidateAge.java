package core_java_Lab_o5;

import java.util.Scanner;

class NotEligible extends Exception {

	private static final long serialVersionUID = 1L;

	NotEligible(String msg) {
		super(msg);
	}
}

public class ValidateAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 15) {
				throw new NotEligible("Not Eligible");
			} else {
				System.out.println("you are eligible");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
