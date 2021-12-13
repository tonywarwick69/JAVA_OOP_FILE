package bai07;

import java.text.DecimalFormat;

public class ProjectLeader extends Programmer {
	DecimalFormat formatter = new DecimalFormat("#0.00");
	public static String inTieuDe() {
		String s="";
		s+="ProjectLeader\n";
		s+=Programmer.inTieuDe();
		s+=String.format("%-15s|\n",  "Month Salary");
		for(int i =0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		return super.toString() +String.format("%-15s|\n",formatter.format(getMonthlySalary()));
	}
	public ProjectLeader(int payrollnumber, String name, double basicMonthSalary, String language) {
		super(payrollnumber, name, basicMonthSalary,language);
		
	}
	public double getMonthlySalary() {
			return BasicMonthSalary+(BasicMonthSalary*0.2);
		
	}

}
