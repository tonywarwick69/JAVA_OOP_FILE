package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

import bai03.GiaoDich;

public class GiaoDichDat extends GiaoDich1{
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		if(LoaiDat.A!= null || LoaiDat.B!=null || LoaiDat.C !=null)
			this.loaiDat = loaiDat;
		else	this.loaiDat="chưa xác định";
	}

	

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat() {
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định");
	}

	public static String getTieuDe() {
		return String.format("%s %12s |%20s |",GiaoDich1.getTieuDe(),"LoaiDat","Thành Tiền");
	}
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("%s %12s |%20s |",super.toString(),loaiDat,df.format(getThanhTien()));

	}
	public double getThanhTien() {
		if(loaiDat.equalsIgnoreCase("A"))
			return super.getThanhTien()*1.5;
		else if(loaiDat.equalsIgnoreCase("B") || loaiDat.equalsIgnoreCase("C") )
				return super.getThanhTien();
		return 0;
	}

}
