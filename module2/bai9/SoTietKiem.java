package bai9;

import java.time.LocalDate;
import java.time.Period;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	@Override
	public String toString() {
		return "STK" + maSo + "[" + ngayMoSo  +"] " + ", kyHan=" + kyHan+"tháng"+",số tháng tính lãi: "+tinhSoThangGoiThuc()+ "Số tiền: "+ soTienGoi
				+ ", laiSuat=" + laiSuat  + ", Tiền lãi"
				+ tinhTienLai() ;
	}
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		super();
		this.maSo = maSo;
		this.ngayMoSo = ngayMoSo;
		this.soTienGoi = soTienGoi;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}
	public double getSoTienGoi() {
		return soTienGoi;
	}
	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public int tinhSoThangGoiThuc() {
		Period age= Period.between(ngayMoSo, LocalDate.now());
		int dt_nam= age.getYears();//số năm chênh lẹch giữa 2  ngày
		int dt_thang=age.getMonths();//số tháng chếnh lệch giữa 2 ngày
		int soThangGoi=dt_nam*12+dt_thang;
		if(soThangGoi%kyHan==0)
			return soThangGoi;
		else 
			return soThangGoi/(kyHan*kyHan);
	}
	public double tinhTienLai() {
		return tinhSoThangGoiThuc()*laiSuat*soTienGoi;
	}
	

}
