package bai08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa{
	private String nhaCungCap;
	private Date ngaySanXuat;
	private Date ngayHetHan;
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat){
		Date ngayHienTai = new Date();
		if(ngaySanXuat.compareTo(ngayHienTai)<0)
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat= new Date();
	}
	public Date getNgayHetHan() {
	return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		if(ngayHetHan.compareTo(this.ngaySanXuat) >0)
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = getNgaySanXuat();
	}
	public HangThucPham(String maHang, String tenHang, int donGia, int slTon, String nhaCungCap, Date ngaySanXuat,
		Date ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, slTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public HangThucPham() {
	}
	public static String inTieuDe() {
		String s="";
		s+="Hang Thuc Pham\n";
		s+=HangHoa.inTieuDe();
		s+=String.format("%-15s|%15s|%15s|\n","Nha Cung Cap","Ngay San Xuat","Ngay Het Han");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return super.toString()+ String.format("%-15s|%15s|%15s|",getNhaCungCap(),sdf.format(getNgaySanXuat()),sdf.format(getNgayHetHan()));
	}
}
