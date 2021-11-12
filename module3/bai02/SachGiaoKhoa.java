package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
public class SachGiaoKhoa extends Sach {
	private String tinhTrang;

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) throws Exception{
		if(tinhTrang.equals("cũ")||tinhTrang.equals("mới"))
			this.tinhTrang = tinhTrang;
		else
			throw new Exception("lỗi tình trạng");
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			String tinhTrang) throws Exception{
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public SachGiaoKhoa() throws Exception{
		this("chưa xác định",LocalDate.now(),0,0,"chưa xác định","chưa xác định");
	}

	
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		return String.format("%s %15s |%20s |",super.toString(),getTinhTrang(),df.format(getThanhTien()));
	}
	
	public static String getTieuDe() {
		

		return String.format("%s %15s |%20s |",Sach.getTieuDe(),"TinhTrang","ThanhTien");

	}
	public double getThanhTien() {
		if(tinhTrang.equals("mới"))
			return getSoLuong()*getDonGia();
		else if(tinhTrang.equals("cũ"))
			return getSoLuong()*getDonGia()*0.5;
		return 0;
	}
}
