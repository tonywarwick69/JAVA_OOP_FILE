package bai8;

public class SinhVien {
	private String maSV;
	private  String hoTen;
	@Override
	public String toString() {
		return   maSV + "|" + hoTen + "\n";
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSV, String hoTen) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	

}
