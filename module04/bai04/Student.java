package bai04;

import java.time.LocalDate;
import java.util.Date;

public class Student {
	private int id;
	private String hoten;
	private LocalDate namsinh;
	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++)
			s+="-";
		s+=String.format("\n|%-15s|%-15s|%15s|","Student ID","Student name","Birthday");
		return s;
	}
	@Override
	public String toString() {
		return String.format("\n|%-15s|%-15s|%15s|",id,hoten,namsinh);
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param hoten
	 * @param namsinh
	 */
	public Student(int id, String hoten, LocalDate namsinh) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hoten == null) ? 0 : hoten.hashCode());
		result = prime * result + id;
		result = prime * result + ((namsinh == null) ? 0 : namsinh.hashCode());
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
		Student other = (Student) obj;
		if (hoten == null) {
			if (other.hoten != null)
				return false;
		} else if (!hoten.equals(other.hoten))
			return false;
		if (id != other.id)
			return false;
		if (namsinh == null) {
			if (other.namsinh != null)
				return false;
		} else if (!namsinh.equals(other.namsinh))
			return false;
		return true;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) throws Exception {
		if(id==this.id)
			throw new Exception("Trùng mã sinh viên");
		else 
			this.id = id;
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	/**
	 * @return the namsinh
	 */
	public LocalDate getNamsinh() {
		return namsinh;
	}
	/**
	 * @param namsinh the namsinh to set
	 */
	public void setNamsinh(LocalDate namsinh) {
		this.namsinh = namsinh;
	}
	

}
