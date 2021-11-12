package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class SachThamKhao extends Sach{
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) throws Exception {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public SachThamKhao() throws Exception {
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định",0);
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		return String.format("%s %15s |%20s |",super.toString(),df.format(getThue()),df.format(getThanhTien()));
	}
	public static String getTieuDe() {
		return String.format("%s %15s |%20s |",Sach.getTieuDe(),"Thue","Thành Tiền");

	}
	public double getThanhTien() {
		return getSoLuong()*getDonGia()+getThue();
	}
}
