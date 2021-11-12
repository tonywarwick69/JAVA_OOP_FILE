package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		if(maGiaoDich!=null)
			this.maGiaoDich = maGiaoDich;
		else	this.maGiaoDich="chưa xác định";
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
		if(donGia>0)
			this.donGia = donGia;
		else this.donGia=0;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		if(soLuong >0)
			this.soLuong = soLuong;
		else this.soLuong=0;
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	public GiaoDich() {
		this("chưa xác định",LocalDate.now(),0,0);
	}
	
	public static String getTieuDe() {
		return String.format("|%10s |%15s |%20s |%10s |","MaGiaoDich","NgayGiaoDich","DonGia","SoLuong");
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		return String.format("|%10s |%15s |%20s |%10d |",maGiaoDich,ngayGiaoDich,df.format(donGia),soLuong);

	}
	public double getThanhTien() {
		return getSoLuong()*getDonGia();
	}

}
