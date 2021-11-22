package bai09;

import bai08.HangHoa;

public class Student extends Person {
	private double diem01;
	private double diem02;
	/**
	 * 
	 */
	@Override
	public String toString() {
		return super.toString()+ String.format("|%-15s|%15s|%15s|",getDiem01(),getDiem02(),diemTB());
	}
	public static String inTieuDe() {
		String s="";
		s+="Student\n";
		s+=Person.inTieuDe();
		s+=String.format("%-15s|%15s|%15s|\n","Điểm 1","Điểm 2","Điểm trung bình");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	
	public double diemTB() {
		double diemTB=(diem01+diem02)/2;
		return diemTB;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param hoten
	 * @param diachi
	 */
	public Student(String hoten, String diachi) {
		super(hoten, diachi);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param hoten
	 * @param diachi
	 * @param diem01
	 * @param diem02
	 */
	public Student(String hoten, String diachi, double diem01, double diem02) {
		super(hoten, diachi);
		this.diem01 = diem01;
		this.diem02 = diem02;
	}
	/**
	 * @return the diem01
	 */
	public double getDiem01() {
		return diem01;
	}
	/**
	 * @param diem01 the diem01 to set
	 */
	public void setDiem01(double diem01) {
		this.diem01 = diem01;
	}
	/**
	 * @return the diem02
	 */
	public double getDiem02() {
		return diem02;
	}
	/**
	 * @param diem02 the diem02 to set
	 */
	public void setDiem02(double diem02) {
		this.diem02 = diem02;
	}
	

}
