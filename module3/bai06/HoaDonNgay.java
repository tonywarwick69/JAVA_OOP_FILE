package bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HoaDonNgay extends HoaDon{
	private int ngayThue;

	public int getNgayThue() {
		return ngayThue;
	}

	public void setNgayThue(int ngayThue) {
		if(ngayThue > 0)
			this.ngayThue = ngayThue;
		else this.ngayThue=0;
	}

	public HoaDonNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKH, String maPhong, float donGia, int ngayThue) {
		super(maHoaDon, ngayHoaDon, tenKH, maPhong, donGia);
		setNgayThue(ngayThue);
	}

	public HoaDonNgay() {
		this("chưa xác định",LocalDate.now(),"chưa xác định","chưa xác định",0,0);
	}
	@Override
	public String toString() {
		return String.format("%s %20s |",super.toString(),ngayThue);
	}
	
	public static String getTieuDe() {
		return String.format("%s %20s |",HoaDon.getTieuDe(),"Ngày Thuê");
	}
	public float getThanhTien() throws Exception {
		if(getNgayThue() <= 7)
			return super.getThanhTien()*ngayThue;
		else
			return (float) ((super.getThanhTien()*ngayThue)-((ngayThue-7)*getDonGia()*0.2));
	}
}
