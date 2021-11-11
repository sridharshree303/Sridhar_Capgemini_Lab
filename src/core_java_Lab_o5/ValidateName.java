package core_java_Lab_o5;

import java.util.Scanner;

class NameCannotBeBlank extends Exception {

	private static final long serialVersionUID = 1L;

	NameCannotBeBlank(String msg) {
		super(msg);
	}
}

public class ValidateName {

	public static void validate(String firstName, String lastName) {
		try {
			if (firstName.length() == 0) {
				throw new NameCannotBeBlank("First name can't be left blank");
			} else if (lastName.length() == 0) {
				throw new NameCannotBeBlank("Last name can't be left blank");
			} else {
				System.out.println("Name validates successfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first name : ");
		String firstName = sc.nextLine();
		
		System.out.print("enter last name : ");
		String lastName = sc.nextLine();
		
		sc.close();
		validate(firstName, lastName);
	}
}
