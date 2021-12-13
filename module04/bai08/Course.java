package bai08;

import java.util.ArrayList;
import java.util.Set;

public class Course {
	private String courseNbr;
	private String courseTitle;
	private int credits;
	/**
	 * @return the courseNbr
	 */
	public String getCourseNbr() {
		return courseNbr;
	}
	/**
	 * @param courseNbr the courseNbr to set
	 */
	public void setCourseNbr(String courseNbr) {
		this.courseNbr = courseNbr;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	private Set<Section> sections;
	public ArrayList<Student> listHS= new ArrayList<Student>();
	public ArrayList<Section> listSec = new ArrayList<Section>();
	public int getNbrStudents(String sectionNbr){
		return listHS.size();
	}
	public void addSection(Section sec){
		listSec.add(sec);
	}
}
