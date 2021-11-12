package bai10;

import java.text.DecimalFormat;
import java.util.Scanner;

import bai10.CDList;
public class TestCD {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		CD cd=new CD();
		DecimalFormat df = new DecimalFormat("#,##0.00");
		CDList cds=new CDList(3);
		/*
		cds.add(new CD(1,"GTA 5",10,1000000));
		cds.add(new CD(2,"Windows 10",100,15000000));
		cds.add(new CD(3,"Far cry 6",5,5000000));
		*/
		cds.nhapDSCD(sc);
		//Tìm kiếm

		
		
		System.out.println("Chọn chức năng trong menu:");
		System.out.println("1)In danh sách CD + tổng tiên");
		System.out.println("2) List CD theo giá thành giảm dần");
		System.out.println("3) List CD sau xóa ");
		System.out.println("4) List CD theo tựa CD tăng dần ");
		System.out.println("5) Tìm kiếm CD theo mã");	
		System.out.println("6) Thoát");
		int menu=sc.nextInt();
		switch (menu) {
			
		case 1: menu=1;
			System.out.println(CD.getTieuDe());
			System.out.println(cds);
			System.out.println("Tổng thành tiền="+df.format(cds.getSumGiaThanh()));
			break;
		case 2: menu=2;
			cds.sortGiamGiaThanh();
			System.out.println(CD.getTieuDe());
			System.out.println(cds);
			break;
		case 3: menu=3;
			System.out.println(CD.getTieuDe());
			cds.deleteCD(1);
			System.out.println(cds);
		case 4: menu=4;
			System.out.println(CD.getTieuDe());
			cds.sortTangTuaCD();
			System.out.println(cds);
			break;
		case 5: menu=5;
			System.out.println("Nhâp mã CD cần tìm");
			int maX=sc.nextInt();
			boolean kq=cds.searchCD(maX);
			if(kq == true ) {
				System.out.println("tìm thấy");
			} else {
				System.out.println("Không tìm thấy ");
			}
			break;
		default: menu=6;
			break;
		}
		
	}

}
