package bai08;

public class Faculty extends Person {
private String office;
private String facultyID;
public static String inTieuDe() {
	String s="";
	s+="Faculty\n";
	s+=Person.inTieuDe();
	s+=String.format("%-15s|%-15s|\n", "facultyID", "office");
	for(int i =0;i<120;i++)
		s+="-";
	s+="\n";
	return s;
}
@Override
public String toString() {
	return super.toString()+String.format("%15s|%15s", facultyID,office);
}
/**
 * 
 */
public Faculty() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param lastName
 * @param firstName
 */
public Faculty(String lastName, String firstName) {
	super(lastName, firstName);
	// TODO Auto-generated constructor stub
}
/**
 * @param lastName
 * @param firstName
 * @param office
 * @param facultyID
 */
public Faculty(String lastName, String firstName,String facultyID, String office ) {
	super(lastName, firstName);
	this.office = office;
	this.facultyID = facultyID;
}
/**
 * @return the office
 */
public String getOffice() {
	return office;
}
/**
 * @param office the office to set
 */
public void setOffice(String office) {
	this.office = office;
}
/**
 * @return the facultyID
 */
public String getFacultyID() {
	return facultyID;
}
/**
 * @param facultyID the facultyID to set
 */
public void setFacultyID(String facultyID) {
	this.facultyID = facultyID;
}
}

