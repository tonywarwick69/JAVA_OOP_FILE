package bai08;

import java.util.Set;

public class Section {
private String semester;
private String sectionNbr;
private String room;
private Faculty facultyMember;
private Set<Enrolment> listEnrolls ;
/**
 * 
 */
public Section() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param semester
 * @param sectionNbr
 * @param room
 * @param facultyMember
 * @param listEnrolls
 */
public Section(String semester, String sectionNbr, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
	super();
	this.semester = semester;
	this.sectionNbr = sectionNbr;
	this.room = room;
	this.facultyMember = facultyMember;
	this.listEnrolls = listEnrolls;
}
/**
 * @return the semester
 */
public String getSemester() {
	return semester;
}
/**
 * @param semester the semester to set
 */
public void setSemester(String semester) {
	this.semester = semester;
}
/**
 * @return the sectionNbr
 */
public String getSectionNbr() {
	return sectionNbr;
}
/**
 * @param sectionNbr the sectionNbr to set
 */
public void setSectionNbr(String sectionNbr) {
	this.sectionNbr = sectionNbr;
}
/**
 * @return the room
 */
public String getRoom() {
	return room;
}
/**
 * @param room the room to set
 */
public void setRoom(String room) {
	this.room = room;
}
}

