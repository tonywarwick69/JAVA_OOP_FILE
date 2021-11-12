package bai04;

import java.time.LocalDate;

import bai03.GiaoDich;
import bai03.GiaoDichTien;
import bai03.GiaoDichVang;

public class Test {

	public static void main(String[] args) {
		GiaoDich1[] a =new GiaoDich1[6];
		a[0]=new GiaoDichDat("21231dsd",LocalDate.of(2013,8,1),9000000,2,"A");
		a[1]=new GiaoDichDat("212sd",LocalDate.of(2013,9,1),4400000,1,"B");
		a[2]=new GiaoDichDat("212d",LocalDate.of(2013,8,31),5000000,3,"C");
		a[3] =new GiaoDichNha("424wdq",LocalDate.of(2013,9,30),4000000,3000,"thường","củ chi");
		a[4] =new GiaoDichNha("4dq",LocalDate.of(2015,9,12),5000000,3000,"cao cấp","củ chi");
		a[5] =new GiaoDichNha("42",LocalDate.of(2016,9,12),6000000,3000,"cao cấp","củ chi");

		xuatThongTinGiaoDich1(a);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		xuatThongTinGiaoDich2(a);
		tinhTongSoLuongTungLoai(a);
		tinhTrungBinhThanhTienGDD(a);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("danh sách giao dịch trong tháng 9 năm 2013:");
		xuatRaGiaoDichTrongThoiHan(a);
	}
	public static void xuatThongTinGiaoDich1(GiaoDich1[] a ) {
		System.out.println("Giao Dịch Đất:\n"+GiaoDichDat.getTieuDe());
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof GiaoDichDat) {	
					System.out.println(a[i]);
			}
			
		}
	}
	public static void xuatThongTinGiaoDich2(GiaoDich1[] a ) {
		System.out.println("Giao Dịch Nhà:\n"+GiaoDichNha.getTieuDe());
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof GiaoDichNha) {	
					System.out.println(a[i]);
			}
			
		}
	}
	public static void tinhTongSoLuongTungLoai(GiaoDich1[] a)
	{
		int k=0,h=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] instanceof GiaoDichNha)
			{
				h++;
			}
			if(a[i] instanceof GiaoDichDat)
				k++;
		}
		System.out.println("tổng số lượng giao dịch nhà: "+h);
		System.out.println("tổng số lượng giao dịch đất: "+k);
	}
	public static void tinhTrungBinhThanhTienGDD(GiaoDich1[] a) {
		double sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof GiaoDichDat)
			{
				sum+=a[i].getThanhTien();
				count++;
			}
		System.out.println("trung bình thành tiền của giao dịch đất: "+sum/count);
	}
	public static void xuatRaGiaoDichTrongThoiHan(GiaoDich1[] a)
	{
		for(int i=0;i<a.length;i++)
			if(a[i].getNgayGiaoDich().isAfter(LocalDate.of(2013,8,31)) && a[i].getNgayGiaoDich().isBefore(LocalDate.of(2013,10,1)))
			{
				if(a[i] instanceof GiaoDichDat)
				{
					System.out.println("Giao Dịch Đất:\n"+GiaoDichDat.getTieuDe());
					System.out.println(a[i]);
					System.out.println("-------------------------------------------------------------------------------------------------------------");

				}
					if(a[i] instanceof GiaoDichNha)
				{
					System.out.println("Giao Dịch Nhà:\n"+GiaoDichNha.getTieuDe());

					System.out.println(a[i]);
					System.out.println("-------------------------------------------------------------------------------------------------------------");

				}
			}
			
	}
}
