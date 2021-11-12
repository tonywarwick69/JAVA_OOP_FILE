package bai11;

import java.util.Scanner;

public class TestCongNhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		CongNhan cn=new CongNhan();
		DanhSachCongNhan dscn=new DanhSachCongNhan(3);
		dscn.add(new CongNhan("Đồng ","Đức Khang",250));
		dscn.add(new CongNhan("Nguyễn ","Phúc Thọ",155));
		dscn.add(new CongNhan("Trần ","Hữu An",237));
		System.out.println("Nhâp số menu để thực hiện chức năng:");
		System.out.println("1) Danh sách công nhân:");
		System.out.println("2) Xóa công nhân theo tên");
		System.out.println("3)Tìm kiếm theo tên công nhân");
		System.out.println("4)Sắp xếp theo số sp giảm dần");
		System.out.println("5) Lấy danh sách công nhân làm được trên 200 sản phẩm");
		System.out.println("0) Thoát");
		int menu=sc.nextInt();
		switch(menu) {
		case 1: menu=1;
			//In danh sách công nhân
			System.out.println(cn.getTieuDe());
			System.out.println(dscn);
			System.out.println("Số lượng công nhân="+dscn.getCount());
			break;
		case 2: menu=2;
			//Xóa
			sc.nextLine();
			System.out.println("Nhập tên công nhân cần xóa");
			String tenxoa=sc.nextLine();
			dscn.deleteCN(tenxoa);
			System.out.println(cn.getTieuDe());
			System.out.println(dscn);
			break;
		case 3: menu=3;
			sc.nextLine();
			//Tìm kiếm theo tên công nhân
			System.out.println("Nhập tên cần tìm ");
			String tentim=sc.nextLine();
			dscn.searchCN(tentim);
			boolean kq=dscn.searchCN(tentim);
			if(kq==true) 
				System.out.println("Tìm thấy công nhân ");
			else 
				System.out.println("Không tìm thấy công nhân");
			break;
		case 4: menu=4;
				//Săp xếp theo số sp giảm dần
				dscn.sortGiamSoSP();
				System.out.println(dscn);
				break;
		case 5: menu=5;
				//•	Phương thức lấy danh sách công nhân làm trên 200 sản phẩm
				dscn.getCN200();
		default: menu=0;
			System.exit(0);
			break;
		} 
		
	
	
		
	
		
		
		
			
		

	}

}
