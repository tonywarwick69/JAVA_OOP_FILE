package bai07;

import java.text.DecimalFormat;

public abstract class Employee {
	private  int payrollNumber;
	private String Name;
	protected double BasicMonthSalary;
	DecimalFormat formatter = new DecimalFormat("#0.00");
	/**
	 * @return the payrollNumber
	 */
	public int getPayrollNumber() {
		return payrollNumber;
	}
	
	public static String inTieuDe() {
		String s="";
		s+=String.format("\n|%-15s|%-15s|%15s|","payrollNumber","Name ","BasicMonthSalary");
		return s;
	}
	@Override
	public String toString() {
		return String.format("\n|%-15s|%-15s|%15s|", payrollNumber,Name,formatter.format(BasicMonthSalary));
	}

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param basicMonthSalary
	 */
	public Employee(int payrollnumber, String  name, double basicMonthSalary) {
		super();
		payrollNumber=payrollnumber;
		Name = name;
		BasicMonthSalary = basicMonthSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(BasicMonthSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + payrollNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(BasicMonthSalary) != Double.doubleToLongBits(other.BasicMonthSalary))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (payrollNumber != other.payrollNumber)
			return false;
		return true;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the basicMonthSalary
	 */
	public double getBasicMonthSalary() {
		return BasicMonthSalary;
	}
	/**
	 * @param basicMonthSalary the basicMonthSalary to set
	 */
	public void setBasicMonthSalary(double basicMonthSalary) {
		BasicMonthSalary = basicMonthSalary;
	}

}
