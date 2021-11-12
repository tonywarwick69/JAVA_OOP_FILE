package bai4;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDangKyXe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner nhap=new Scanner(System.in);
		System.out.println("Tên chủ xe\t\t Loại xe\t Dung tích\t Trị giá\t Thuế phải nộp");
		System.out.println("======================================================================================================================");
		DangKyXe xe1=new DangKyXe("Nguyen Thu Loan", "Future Neo",100,35000000   );
		DangKyXe xe2=new DangKyXe("Le Minh Tinh","Ford Ranger",3000,250000000    );
		DangKyXe xe3=new DangKyXe("Nguyen Minh Triet","Landscape",1500,1000000000  );
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
		/*
		DangKyXe xe4=new DangKyXe();
		System.out.println("Nhap ten chu xe");
		String tencx=nhap.nextLine();
		xe4.setChuxe(tencx);
		System.out.println("Nhap loai xe");
		String loaixe4=nhap.nextLine();
		xe4.setLoaixe(loaixe4);
		System.out.println("Nhap dung tich xe");
		int dungtichxe=nhap.nextInt();
		xe4.setXylanh(dungtichxe);
		System.out.println("Nhap tri gia cua xe");
		double giaxe=nhap.nextDouble();
		xe4.setTrigia(giaxe);
		System.out.println(xe4);
		*/
		DangKyXe []dkxe = new DangKyXe[4];
		//Nhap danh sach xe
		for(int i=0;i<3;i++) {
			dkxe[i]=new DangKyXe();
			System.out.println("Nhap ten chu xe");
			dkxe[i].setChuxe(nhap.nextLine());
			System.out.println("Nhap loai xe");
			dkxe[i].setLoaixe(nhap.nextLine());
			System.out.println("Nhap dung tich xe");
			dkxe[i].setXylanh(nhap.nextInt());
			System.out.println("Nhap tri gia cua xe");
			dkxe[i].setTrigia(nhap.nextDouble());
			nhap.nextLine();
				
		}
		//Xuat danh sach xe
		for(int i=0;i<3;i++) {
			
			System.out.println(dkxe[i]);
				
		}
		
		

	}

}
