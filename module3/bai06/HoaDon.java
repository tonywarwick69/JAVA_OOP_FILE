package bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKH;
	private String maPhong;
	private float donGia;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		if(maHoaDon!=null)
			this.maHoaDon = maHoaDon;
		else this.maHoaDon="chưa xác định";
	}
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		if(ngayHoaDon.isBefore(LocalDate.now()))
			this.ngayHoaDon = ngayHoaDon;
		else this.ngayHoaDon=LocalDate.now();
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		if(tenKH!=null)
			this.tenKH = tenKH;
		else this.tenKH="chưa xác định";
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if(maPhong!=null)
			this.maPhong = maPhong;
		else this.maPhong="chưa xác định";
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else this.donGia=0;
	}
	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKH, String maPhong, float donGia) {
		super();
		setMaHoaDon(maHoaDon);
		setNgayHoaDon(ngayHoaDon);
		setTenKH(tenKH);
		setMaPhong(maPhong);
		setDonGia(donGia);
	}
	public HoaDon() {
		this("chưa xác định",LocalDate.now(),"chưa xác định","chưa xác định",0);
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("| %15s | %15s | %20s | %15s | %20s |",maHoaDon,ngayHoaDon,tenKH,maPhong,df.format(donGia));
	}
	
	public static String getTieuDe() {
		return String.format("| %15s | %15s | %20s | %15s | %20s |","Mã Hóa Đơn","Ngày Hóa Đơn","Tên Khách Hàng","Mã Phòng","Đơn Giá");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHoaDon == null) ? 0 : maHoaDon.hashCode());
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		if (maHoaDon == null) {
			if (other.maHoaDon != null)
				return false;
		} else if (!maHoaDon.equals(other.maHoaDon))
			return false;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		return true;
	}
	public float getThanhTien() throws Exception {
		return getDonGia();
	}
	

}
