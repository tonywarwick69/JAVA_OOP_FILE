package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		if(loaiVang!=null)
			this.loaiVang = loaiVang;
		else this.loaiVang="chưa xác định";
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang() {
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định");
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}
	public static String getTieuDe() {
		return String.format("%s %12s |%20s |",GiaoDich.getTieuDe(),"LoaiVang","Thành Tiền");
	}
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		return String.format("%s %12s |%20s |",super.toString(),loaiVang,df.format(getThanhTien()));

	}
	public double tinhTien() {
		return super.getThanhTien();
	}
	
}
