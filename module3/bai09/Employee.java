package bai09;

import bai08.HangHoa;

public class Employee extends Person {
	private int hesoluong;

	@Override
	public String toString() {
		return super.toString()+ String.format("%22s|%-15s|", hesoluong,tinhluong()) ;
	}
	/**
	 * 
	 */
	public static String inTieuDe() {
		String s="";
		s+="\nEmployee\n";
		s+=Person.inTieuDe();
		s+=String.format("%22s|%15s|\n","Hệ số lương","Tiền lương");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	public double tinhluong() {
		double luong=1000;
		if(hesoluong==1)
			return luong;
		else if(hesoluong==2)
			return luong=luong*2;
		else if(hesoluong==3)
			return luong = luong*3;
		else if(hesoluong==4)
			return luong=luong*4;
		else
			return 0;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hoten
	 * @param diachi
	 */
	public Employee(String hoten, String diachi) {
		super(hoten, diachi);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hoten
	 * @param diachi
	 * @param hesoluong
	 */
	public Employee(String hoten, String diachi, int hesoluong) {
		super(hoten, diachi);
		this.hesoluong = hesoluong;
	}

	/**
	 * @return the hesoluong
	 */
	public int getHesoluong() {
		return hesoluong;
	}

	/**
	 * @param hesoluong the hesoluong to set
	 */
	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

}
