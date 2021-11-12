package bai5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestHangThucPham {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		System.out.println("Ma_Hang\tTen_Hang\t Don_Gia\t Ngay_San_Xuat\t Ngay_Het_Han\t Ghi chu\t");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		HangThucPham htp1=new HangThucPham("001","Gạo",100000,LocalDate.parse("2021-04-07"),LocalDate.parse("2022-03-03"));
		System.out.println(htp1+"\t");
		HangThucPham htp2=new HangThucPham();
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap ma hang");
		String mh=nhap.nextLine();
		
		System.out.println("Nhap ten hang");
		String th=nhap.nextLine();
		htp2.setTenhang(th);
		System.out.println("Nhap don gia");
		double dgia=nhap.nextDouble();
		htp2.setDongia(dgia);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nsx=LocalDate.parse("08/02/2021",dtf);
		htp2.setNgaysanxuat(nsx);
		LocalDate nhh=LocalDate.parse("08/09/2021",dtf);
		htp2.setNgayhethan(nhh);
		System.out.println(htp2);
		
		
		

	}

}
