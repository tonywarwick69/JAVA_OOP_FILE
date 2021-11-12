package bai02;
import java.text.DecimalFormat;
import java.time.LocalDate;


public class Sach {
	private  String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		if(!maSach.equals(""))
			this.maSach = maSach;
		else this.maSach="chưa xác định";
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	/**
	 * 
	 * @param ngayNhap phải trước ngày hiện tại
	 */
	public void setNgayNhap(LocalDate ngayNhap) {
		if(ngayNhap.isBefore(LocalDate.now()))
			this.ngayNhap = ngayNhap;
		else this.ngayNhap=LocalDate.now();
	}
	
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else this.donGia=0;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		if(soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong=0;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		if(!nhaXuatBan.equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else this.nhaXuatBan="chưa xác định";
	}
	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}
	public Sach() {
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định");
	}
	public static String getTieuDe() {
		return String.format("|%10s |%12s |%20s |%10s |%15s |","MaSach","NgayNhap","DonGia","SoLuong","NhaXuatBan");
	}
	@Override
	public String toString() {
		
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		 return String.format("|%10s |%12s |%20s |%10d |%15s |",getMaSach(),getNgayNhap(),df.format(getDonGia()),getSoLuong(),getNhaXuatBan());
		
	}
	public double getThanhTien() {
		return getSoLuong()*getDonGia();
	}
	
}
