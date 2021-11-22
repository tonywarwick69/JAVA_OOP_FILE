package bai09;

import bai08.HangHoa;

public class Customer extends Person {
	private String tencty;
	private double trigiaHD;
	/**
	 * 
	 */
	@Override
	public String toString() {
		return super.toString()+ String.format("%22s|%15s|",tencty,trigiaHD);
	}
	public static String inTieuDe() {
		String s="";
		s+="\nCustomer\n";
		s+=Person.inTieuDe();
		s+=String.format("%22s|%15s|\n","Tên công ty","Trị giá hóa đơn");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param hoten
	 * @param diachi
	 */
	public Customer(String hoten, String diachi) {
		super(hoten, diachi);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param hoten
	 * @param diachi
	 * @param tencty
	 * @param trigiaHD
	 */
	public Customer(String hoten, String diachi, String tencty, double trigiaHD) {
		super(hoten, diachi);
		this.tencty = tencty;
		this.trigiaHD = trigiaHD;
	}
	/**
	 * @return the tencty
	 */
	public String getTencty() {
		return tencty;
	}
	/**
	 * @param tencty the tencty to set
	 */
	public void setTencty(String tencty) {
		this.tencty = tencty;
	}
	/**
	 * @return the trigiaHD
	 */
	public double getTrigiaHD() {
		return trigiaHD;
	}
	/**
	 * @param trigiaHD the trigiaHD to set
	 */
	public void setTrigiaHD(double trigiaHD) {
		this.trigiaHD = trigiaHD;
	}
	
	
}
