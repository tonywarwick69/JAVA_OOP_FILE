package bai06;

import java.util.Collections;
import java.util.Scanner;

public class TestPhongHoc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		PhongHoc p1 = new PhongMayTinh("A01","A",40,5,20);
		PhongHoc p2 = new PhongLyThuyet("B07","B",80,12,false);
		PhongHoc p3 = new PhongThiNghiem("H11","H",80,6,"Hóa hữu cơ",50,true);
		PhongHoc p4 = new PhongMayTinh("A05","A",50,4,40);
		PhongHoc p5 = new PhongLyThuyet("B12","B",75,16,true);
		PhongHoc p6 = new PhongThiNghiem("H2","H",60,5,"Hóa Sinh",50,false);
		PhongHoc p7 = new PhongMayTinh("A09","A",90,4,65);
		ListPhongHoc list = new ListPhongHoc();
		list.addPhong(p1);
		list.addPhong(p2);
		list.addPhong(p3);
		list.addPhong(p4);
		list.addPhong(p5);
		list.addPhong(p6);
		
		System.out.println(list.toString());
		p5 = new PhongLyThuyet("B12","B",72,16,false);
		list.updatePhong("B12", p5);
		System.out.println("List Phòng học sau update B12:\n"+list.toString());
		list.deletePhong("A05");
		System.out.println("List Phòng học sau delete A05:\n"+list.toString());

		//System.out.println("\nNhập mã phòng cần tìm:");
		//String ma = sc.nextLine();
		//System.out.println("Thông tin phòng"+list.searchPhong(ma));
		
		System.out.println("Danh sách dãy nhà tăng dần:\n"+list.sortTangDayNha());
		System.out.println("Danh sách phòng diện tích giảm dần:\n"+list.sortGiamDienTich());
		System.out.println("Tổng số phòng học:"+list.getSize());
		
	}

}
