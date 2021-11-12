package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

import bai02.Sach;
import bai02.SachGiaoKhoa;
import bai02.SachThamKhao;
import bai04.GiaoDich1;
import bai04.GiaoDichDat;
import bai04.GiaoDichNha;

public class Test {
	public static void main(String[] args) {
		
		KhachHang[] a=new KhachHang[6];
		a[0] = new KhachHangNN("1241dsa","Lê Bùi",LocalDate.of(2012,8,22),53,3500,"USA");
		a[1] = new KhachHangNN("12sa","Lê Giàu",LocalDate.of(2018,9,22),120,3500,"Trung Quốc");
		a[2] = new KhachHangNN("124a","Lê Thành",LocalDate.of(2014,1,22),40,3500,"Anh");
		a[3] = new KhachHangVN("ad2d2512","Nguyễn Như",LocalDate.of(2018,9,22),102,3500,"sản xuất",22);
		a[4] = new KhachHangVN("a242ed2","Nguyễn Tiền",LocalDate.of(2018,9,22),172,3500,"sinh hoạt",12);
		a[5] = new KhachHangVN("ad2","Nguyễn Mạnh",LocalDate.of(2018,7,22),142,3500,"kinh doanh",42);
		
		System.out.println("Khách Hàng Nước Ngoài:\n"+KhachHangNN.getTieuDe());
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		xuatThongTinKHNN(a);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\nKhách Hàng Việt Nam :\n"+KhachHangVN.getTieuDe());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		xuatThongTinKHVN(a);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		tinhTongTungDonHangVN(a);
		tinhTongTungDonHangNN(a);
		tinhTrungBinhThanhTienNN(a);
		System.out.println("Danh sách khách hàng tham gia trong tháng 9 năm 2018:");
		xuatRaGiaoDichTrongThoiHan(a);
	}
	public static void xuatThongTinKHNN(KhachHang[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof KhachHangNN) {
					
					System.out.println(a[i]);
			}
			
		}
	}
	public static void xuatThongTinKHVN(KhachHang[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof KhachHangVN) {
					
					System.out.println(a[i]);
			}
			
		}
	}
	public static void tinhTongTungDonHangVN(KhachHang[] a) {
		int sumvn=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof KhachHangVN) {
				sumvn+=a[i].getSoKW();
				
			}
			System.out.println("Số KW Khách hàng VN sử dụng: "+sumvn);
	}
	public static void tinhTongTungDonHangNN(KhachHang[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof KhachHangNN) {
				sum+=a[i].getSoKW();
				
			}
			System.out.println("Số KW Khách hàng nước ngoài sử dụng: "+sum);
	}
	public static void tinhTrungBinhThanhTienNN(KhachHang[] a) {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");
		int count=0;
		float tb=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof KhachHangNN) {
				tb+=a[i].getThanhTien();
				count++;
				
			}
			System.out.println("trung bình thành tiền của khách hàng người nước ngoài.: "+df.format(tb/count));
	}
	public static void xuatRaGiaoDichTrongThoiHan(KhachHang[] a)
	{
		for(int i=0;i<a.length;i++)
			if(a[i].getNgayLap().isAfter(LocalDate.of(2018,8,31)) && a[i].getNgayLap().isBefore(LocalDate.of(2018,10,1)))
			{
				if(a[i] instanceof KhachHangNN)
				{
					System.out.println("Khách hàng nước ngoài:\n"+KhachHangNN.getTieuDe());
					System.out.println(a[i]);
					System.out.println("-------------------------------------------------------------------------------------------------------------");

				}
					if(a[i] instanceof KhachHangVN)
				{
					System.out.println("Khách hàng VN:\n"+KhachHangVN.getTieuDe());

					System.out.println(a[i]);
					System.out.println("-------------------------------------------------------------------------------------------------------------");

				}
			}
			
	}
	
}
