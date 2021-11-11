package core_java_Lab_o5;

import core_java_Lab_o5.com.cg.eis.exception.EmployeeException;

public class SalaryOfEmployee {

	public static void main(String[] args) {
		SalaryOfEmployee obj = new SalaryOfEmployee();
		try {
			obj.checkSalary(2000);
		} catch (EmployeeException ie) {
			System.out.println(ie.getMessage());
		}

	}

	public void checkSalary(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary should be above 3000");
		}
	}

}
