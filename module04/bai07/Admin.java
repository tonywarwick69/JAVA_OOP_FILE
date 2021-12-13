package bai07;

import java.text.DecimalFormat;

public class Admin extends Employee{
	private String Department ;
	DecimalFormat formatter = new DecimalFormat("#0.00");
	/**
	 * 
	 */
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payrollnumber
	 * @param name
	 * @param basicMonthSalary
	 */
	public Admin(int payrollnumber, String name, double basicMonthSalary) {
		super(payrollnumber, name, basicMonthSalary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payrollnumber
	 * @param name
	 * @param basicMonthSalary
	 * @param department
	 */
	public Admin(int payrollnumber, String name, double basicMonthSalary, String department) {
		super(payrollnumber, name, basicMonthSalary);
		Department = department;
	}
	
	public static String inTieuDe() {
		String s="";
		s+="Admin\n";
		s+=Employee.inTieuDe();
		s+=String.format("%-15s|%-15s|\n", "Department", "Month Salary");
		for(int i =0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		return super.toString() +String.format("%-15s|%15s\n", Department,formatter.format(getMonthlySalary()));
	}
	public double getMonthlySalary() {
			return BasicMonthSalary+(BasicMonthSalary*0.4);
	}
	

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return Department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		Department = department;
	}

}
