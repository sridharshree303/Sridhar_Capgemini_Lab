package core_java_Lab_o4.com.cg.eis.service;

import core_java_Lab_o4.com.cg.eis.bean.Employee;

public interface EmployeeService {

	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
}
