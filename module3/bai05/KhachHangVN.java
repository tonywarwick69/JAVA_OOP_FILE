package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class KhachHangVN extends KhachHang{
	private String doiTuongKH;
	private float dinhMuc;
	public String getDoiTuongKH() {
		return doiTuongKH;
	}
	public void setDoiTuongKH(String doiTuongKH) {
		if(doiTuongKH.equalsIgnoreCase("sinh hoạt") || doiTuongKH.equalsIgnoreCase("kinh doanh") || doiTuongKH.equalsIgnoreCase("sản xuất") )
			this.doiTuongKH = doiTuongKH;
		else this.doiTuongKH="chưa xác định";
	}
	public float getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(float dinhMuc) {
		if(dinhMuc > 0)
			this.dinhMuc = dinhMuc;
		else this.dinhMuc=0;
	}
	public KhachHangVN(String maKH, String hoTen, LocalDate ngayLap, int soKW, float donGia, String doiTuongKH,
			float dinhMuc) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		setDoiTuongKH(doiTuongKH);
		setDinhMuc(dinhMuc);
	}
	public KhachHangVN() {
		this("chưa xác định","chưa xác định",LocalDate.now(),0,0,"chưa xác định",0);
	}
	
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		return String.format("%s  %20s | %14f | %20s |",super.toString(),doiTuongKH,dinhMuc,df.format(getThanhTien()));

	}
	public static String getTieuDe() {
		return String.format("%s  %20s | %14s | %20s |",KhachHang.getTieuDe(),"Đối Tượng KH","Định Mức","Thành Tiền");
	}
	public float getThanhTien() {
		if(getSoKW() <= dinhMuc)
			return super.getThanhTien();
		else return (float) (super.getThanhTien()*getDinhMuc() + (getSoKW()-getDinhMuc())*getDonGia()*2.5);
	}
}
