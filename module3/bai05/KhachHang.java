package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private LocalDate ngayLap;
	private int soKW;
	private float donGia;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		if(maKH!=null)
			this.maKH = maKH;
		else this.maKH="chưa xác định";
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen!=null)
			this.hoTen = hoTen;
		else this.hoTen="chưa xác định";
		
	}
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		if(ngayLap.isBefore(LocalDate.now()))
			this.ngayLap = ngayLap;
		else this.ngayLap=LocalDate.now();
	}
	public float getSoKW() {
		return soKW;
	}
	public void setSoKW(int soKW) {
		if(soKW > 0)
			this.soKW = soKW;
		else this.soKW=0;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else this.donGia=0;
	}
	public KhachHang(String maKH, String hoTen, LocalDate ngayLap, int soKW, float donGia) {
		super();
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLap(ngayLap);
		setSoKW(soKW);
		setDonGia(donGia);
	}
	public KhachHang() {
		this("chưa xác định","chưa xác định",LocalDate.now(),0,0);
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("|%12s | %15s | %15s | %15d | %20s |",maKH,hoTen,ngayLap,soKW,df.format(donGia));

	}
	
	public static String getTieuDe() {
		return String.format("|%12s | %15s | %15s | %15s | %20s |","Mã KH","Họ Tên","Ngày Lập","Số KW Dùng","Đơn Giá");
	}
	public float getThanhTien() {
		return getDonGia()*soKW;
	}
}
