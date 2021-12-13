package bai08;

import java.util.ArrayList;

public class Enrolment {
	private Student student;
	private String status;
	private String grade;
	private float numGrade;
	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++) 
			s+="-";
		s+=String.format("|%15s|%15s|%15s|", "status","grade","numGrade");
		return s;	
	}
	@Override
	public String toString() {
		return super.toString()+String.format("|%15s|%15s|%15s|", status,grade,numGrade);
	}
	/**
	 * 
	 */
	public Enrolment() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param student
	 * @param status
	 * @param grade
	 * @param numGrade
	 */
	public Enrolment(Student student, String status, String grade, float numGrade) {
		super();
		this.student = student;
		this.status = status;
		this.grade = grade;
		this.numGrade = numGrade;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the numGrade
	 */
	public float getNumGrade() {
		return numGrade;
	}
	/**
	 * @param numGrade the numGrade to set
	 */
	public void setNumGrade(float numGrade) {
		this.numGrade = numGrade;
	}
	
}

