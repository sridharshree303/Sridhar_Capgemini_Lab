package core_java_Lab_o5.com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeException(String s) {
		super(s);

	}
	
	public EmployeeException() {
		super("Salary is Below 3000");

	}

}
