package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDich1 {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		if(maGiaoDich!=null)
			this.maGiaoDich = maGiaoDich;
		else this.maGiaoDich="chưa xác định";
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		if(ngayGiaoDich.isBefore(LocalDate.now()))
			this.ngayGiaoDich = ngayGiaoDich;
		else this.ngayGiaoDich=LocalDate.now();
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else this.donGia=0;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if(dienTich > 0)
			this.dienTich = dienTich;
		else this.dienTich=0;
	}
	public GiaoDich1(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public GiaoDich1() {
		this("chưa xác định",LocalDate.now(),0,0);
	}
	public static String getTieuDe() {
		return String.format("|%10s |%20s |%20s |%10s |","MaGiaoDich","NgayGiaoDich","DonGia","DienTich");
	}
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("|%10s |%20s |%20s |%10.2f |",maGiaoDich,ngayGiaoDich,df.format(donGia),dienTich);

	}
	public double getThanhTien() {
		return dienTich*donGia;
	}
}
