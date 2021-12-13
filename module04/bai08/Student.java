package bai08;



public class Student extends Person {
	private int yearMatriculated;
	private String studentID;
	public static String inTieuDe() {
		String s="";
		s+="Student\n";
		s+=Person.inTieuDe();
		s+=String.format("%-15s|%-15s|\n", "studentID", "year Matriculated");
		for(int i =0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("|%15s|%15s|",studentID,yearMatriculated);
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param lastName
	 * @param firstName
	 */
	public Student(String lastName, String firstName) {
		super(lastName, firstName);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param lastName
	 * @param firstName
	 * @param yearMatriculated
	 * @param studentID
	 */
	public Student(String lastName, String firstName,String studentID, int yearMatriculated ) {
		super(lastName, firstName);
		this.yearMatriculated = yearMatriculated;
		this.studentID = studentID;
	}
	/**
	 * @return the yearMatriculated
	 */
	public int getYearMatriculated() {
		return yearMatriculated;
	}
	/**
	 * @param yearMatriculated the yearMatriculated to set
	 */
	public void setYearMatriculated(int yearMatriculated) {
		this.yearMatriculated = yearMatriculated;
	}
	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
}

