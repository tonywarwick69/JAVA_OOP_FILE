package bai08;

public class HangHoa {
	protected int mahang;
	protected String tenhang;
	protected double dongia;
	protected int soluong;
	@Override
	public String toString() {
		return "HangHoa [mahang=" + mahang + ", tenhang=" + tenhang + ", dongia=" + dongia + ", soluong=" + soluong
				+ "]";
	}
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangHoa(int mahang, String tenhang, double dongia, int soluong) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
		this.soluong = soluong;
	}
	public int getMahang() {
		return mahang;
	}
public void setMahang(int mahang) {
		
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	

}
