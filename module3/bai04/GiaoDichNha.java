package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

import bai03.GiaoDich;

public class GiaoDichNha extends GiaoDich1{
	private String loaiNha;
	private String diaChi;
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		if(loaiNha.equalsIgnoreCase("cao cấp") || loaiNha.equalsIgnoreCase("thường"))
			this.loaiNha = loaiNha;
		else this.loaiNha="chưa xác định";
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		if(diaChi!=null)
			this.diaChi = diaChi;
		else this.diaChi="chưa xác định";
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public GiaoDichNha() {
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định","chưa xác định");
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}
	public static String getTieuDe() {
		return String.format("%s %12s |%12s |%20s  |",GiaoDich1.getTieuDe(),"LoaiNha","DiaChi","Thành Tiền");
	}
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("%s %12s |%12s |%20s |",super.toString(),loaiNha,diaChi,df.format(getThanhTien()));

	}
	public double getThanhTien() {
		if(loaiNha.equalsIgnoreCase("cao cấp"))
			return super.getThanhTien();
		else if(loaiNha.equalsIgnoreCase("thường"))
				return super.getThanhTien()*0.9;
		return 0;
	}
	
}
