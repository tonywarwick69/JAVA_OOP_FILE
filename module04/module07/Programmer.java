package module07;

public class Programmer extends Employee{
	private String Language;
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
