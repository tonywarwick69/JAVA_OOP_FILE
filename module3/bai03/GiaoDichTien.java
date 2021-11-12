package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTien extends GiaoDich{
	private double tiGia;
	private String loaiTien;
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		if(tiGia > 0)
			this.tiGia = tiGia;
		else this.tiGia=0;
	}
	public String getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(String loaiTien) {
		if(loaiTien.equalsIgnoreCase("VND")|| loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("EURO"))
			this.loaiTien = loaiTien;
		else	this.loaiTien="chưa xác định";
	}
	public GiaoDichTien(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			String loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	public GiaoDichTien() {
		this("chưa xác định",LocalDate.now(),0,0,0,"chưa xác định");
	}
	public GiaoDichTien(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}
	public double getThanhTien() {
		if(loaiTien.equalsIgnoreCase("VN"))
			return super.getThanhTien();
		else if(loaiTien.equalsIgnoreCase("USD")|| loaiTien.equalsIgnoreCase("EURO"))
				return getTiGia()*super.getThanhTien();
		return 0;
	}
	public static String getTieuDe() {
		return String.format("%s %12s |%10s |%20s |",GiaoDich.getTieuDe(),"TiGia","LoaiTien","Thành Tiền");
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		return String.format("%s %12.2f |%10s |%20s |",super.toString(),tiGia,loaiTien,df.format(getThanhTien()));

	}
	
	
}
