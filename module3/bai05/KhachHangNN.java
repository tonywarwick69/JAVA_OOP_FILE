package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class KhachHangNN extends KhachHang{
	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		if(quocTich!=null)
			this.quocTich = quocTich;
		else this.quocTich="chưa xác định";
	}

	public KhachHangNN(String maKH, String hoTen, LocalDate ngayLap, int soKW, float donGia, String quocTich) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		setQuocTich(quocTich);
	}

	public KhachHangNN() {
		this("chưa xác định","chưa xác định",LocalDate.now(),0,0,"chưa xác định");
	}

	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("%s  %20s | %20s |",super.toString(),quocTich,df.format(getThanhTien()));

	}
	public static String getTieuDe() {
		return String.format("%s  %20s | %20s |",KhachHang.getTieuDe(),"Quốc Tịch","Thành Tiền");
	}
	public float getThanhTien() {
	
			return super.getThanhTien();
		
	}
	
	
}
