package bai09;

public abstract class Person {
	private String hoten;
	private String diachi;
	/**
	 * @param hoten
	 * @param diachi
	 */
	public Person(String hoten, String diachi) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
	}
	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++)
			s+="-";
		s+=String.format("\n|%-15s|%-15s|","Họ tên","Địa chỉ");
		return s;
	}
	@Override
	public String toString() {
		return String.format("|%-15s|%-15s",hoten,diachi);
	}
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setHoten(String hoten) throws Exception {
		if(!hoten.isEmpty())
			this.hoten = hoten;
		else
			throw new Exception("Họ tên không được để trống");
	}
	/**
	 * @return the diachi
	 */
	public String getDiachi() {
		return diachi;
	}
	/**
	 * @param diachi the diachi to set
	 */
	public void setDiachi(String diachi)throws Exception {
		if(!diachi.isEmpty())
			this.diachi = diachi;
		else
			throw new Exception("Địa chỉ không được để trống");
	}

}
