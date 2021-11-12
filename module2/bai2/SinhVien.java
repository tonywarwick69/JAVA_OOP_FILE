package bai2;

public class SinhVien {
	private int masv;
	private String hoten;
	private double diemLT;
	private double diemTH;
	
	
	

	
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diemLT=" + diemLT + ", diemTH=" + diemTH
				+ ", diemTB=" + diemTB() + "]";
	}
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
		this.masv = 0;
		this.hoten = null;
		this.diemLT = 0;
		this.diemTH = 0;
		
	}
	public SinhVien(int masv, String hoten, double diemLT, double diemTH ) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
		
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		if(masv>0) {
			this.masv = masv;
		}
		
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		if(hoten!="") {
			this.hoten = hoten;
		}
		
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		if(diemLT>0) {
			this.diemLT = diemLT;
		}
		
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		if(diemTH>0) {
			this.diemTH=diemTH;
		}
		
	}
	public  double diemTB() {
		return (diemLT+diemTH)/2;
	}
	

}
