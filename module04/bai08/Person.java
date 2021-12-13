package bai08;

public  class Person {
	protected String lastName;
	protected String firstName;


	@Override
	public String toString() {
		return String.format("%-15s|%-15s|",firstName, lastName);
	}

	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++) 
			s+="-";
		s+=String.format("%-15s|%-15s|","First Name", "Last name");
		return s;	
	}
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
