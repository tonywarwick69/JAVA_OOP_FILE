package bai08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date ngaySanXuat = sdf.parse("01-10-2020");
		Date ngayHetHan = sdf.parse("03-11-2020");
		HangHoa h1 = new HangThucPham("AAAAA", "Rau muong", 5000, 100, "Rau Xanh", ngaySanXuat, ngayHetHan);
		HangHoa h2 = new HangThucPham("BBBBB", "Ca rot", 7000, 110, "Cu qua", ngaySanXuat, ngayHetHan);
		HangHoa h3 = new HangSanhSu("CCCCC","CHEN SU",1000,50,"ABC",new Date());
		HangHoa h4 = new HangDienMay("DDDDD","May phat dien",12000,31,24,500);
		ListHangHoa list = new ListHangHoa();
		list.themHangHoa(h1);
		list.themHangHoa(h2);
		list.themHangHoa(h3);
		list.themHangHoa(h4);
		
		System.out.println(list.toString());
		String search = "CCCCC";
		System.out.println("Kết quả tìm kiếm hàng có mã "+search);
		
		System.out.println(list.searchHanghoa(search));
		System.out.println("Danh sách hàng sau xóa:");
		list.xoaHang("AAAAA");
		System.out.println(list.toString());
		HangHoa h5 = new HangDienMay("DDDDD","Máy bơm nước",12000,31,24,500);
		list.capNhatHang("DDDDD", h5);
		System.out.println("Danh sách hàng sau cập nhật:\n"+list.toString());
		}
}
