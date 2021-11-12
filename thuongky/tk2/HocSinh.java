package tk2;

public class HocSinh {
	private int mahocsinh;
	private String hoten;
	private int tuoi;
	private String lop;
	private double hocphi;
	public int getMahocsinh() {
		return mahocsinh;
	}
	public void setMahocsinh(int mahocsinh) {
		if(mahocsinh>0) 
			this.mahocsinh = mahocsinh;
		else
			System.out.println("Error");
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		if(!hoten.isEmpty())
			this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		if(lop=="1"||lop=="2")
		this.lop = lop;
	}
	public double getHocphi() {
		return hocphi;
	}
	public void setHocphi(double hocphi) {
		this.hocphi = hocphi;
	}
	public double tinhHocPhiMienGiam() {
		
	}
	
	

}
