package bai07;

import java.text.DecimalFormat;

public class Programmer extends Employee{
	DecimalFormat formatter = new DecimalFormat("#0.00");
	private String Language;
	public static String inTieuDe() {
		String s="";
		s+="Programmer\n";
		s+=Employee.inTieuDe();
		s+=String.format("%-15s|%-15s|\n", "Language", "Month Salary");
		for(int i =0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		return super.toString() +String.format("%-15s|%15s\n", Language,formatter.format(getMonthlySalary()));
	}

	/**
	 * 
	 */
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payrollnumber
	 * @param name
	 * @param basicMonthSalary
	 */
	public Programmer(int payrollnumber, String name, double basicMonthSalary) {
		super(payrollnumber, name, basicMonthSalary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payrollnumber
	 * @param name
	 * @param basicMonthSalary
	 * @param language
	 */
	public Programmer(int payrollnumber, String name, double basicMonthSalary, String language) {
		super(payrollnumber, name, basicMonthSalary);
		Language = language;
	}

	public double getMonthlySalary() {
		if(Language.equals("Java"))
			return BasicMonthSalary+(BasicMonthSalary*0.2);
		else 
			return BasicMonthSalary;
	}
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return Language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		Language = language;
	}

}
