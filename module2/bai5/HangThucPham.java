package bai5;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	protected String mahang;
	private String tenhang;
	private double dongia;
	private LocalDate  ngaysanxuat;
	private LocalDate  ngayhethan;
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String mahang, String tenhang, double dongia, LocalDate  ngaysanxuat, LocalDate  ngayhethan) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
	}
	public String getMahang() {
		return mahang;
	}
	//Gan ma hang la Private de ko cho nguoi khac chinh sua
	private void setMahang(String mahang) throws Exception {
		if(!mahang.trim().equals(""))
			this.mahang = mahang;
		else
			throw new Exception("Loi: Ma hang roi!");
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
	public void setDongia(double dongia)  {
		if(dongia>0)
			this.dongia = dongia;
		else
			this.dongia=0;
	}
	public LocalDate  getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(LocalDate  ngaysanxuat) {
		if(ngaysanxuat.isBefore(LocalDate.now()))
			this.ngaysanxuat = ngaysanxuat;
		else
			this.ngaysanxuat=LocalDate.now();
	}
	public LocalDate  getNgayhethan() {
		
		return ngayhethan;
	}
	public void setNgayhethan(LocalDate  ngayhethan) {
		if(ngayhethan.isAfter(ngaysanxuat))
			this.ngayhethan = ngayhethan;
		else
			this.ngayhethan=ngaysanxuat;
	}
	public boolean hetHan() {
		return ngayhethan.isBefore(LocalDate.now())?true:false;
	}
	public String ghichuHetHan() {
		String ghichu;
		if(hetHan()==true) {
			ghichu="Hang het han";
			return ghichu;
		}
			 
		else {
			ghichu="";
			return ghichu;
		}
			
	}
	@Override
	public String toString() {
		return  mahang + "\t"+   tenhang+ "\t\t"  + dongia+ "\t  " + ngaysanxuat+ "\t  "  + ngayhethan+ "\t"  + ghichuHetHan()+ "\t" ;
	}
	
	

}
