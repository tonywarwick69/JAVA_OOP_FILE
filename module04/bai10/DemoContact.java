package bai10;

import java.util.Scanner;

public class DemoContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] dt1= {1,2,3,4,5};
		Contact c1= new Contact(dt1,"Tony",25,true,"Cộng Hòa, Tân Bình");
		int[] dt2= {6,7,8,9,10};
		Contact c2= new Contact(dt2,"Tran Huyen Tran",23,false,"Hoa Sữa, Phú Nhuận");
		ContactList list = new ContactList();
		list.addContact(c1);
		list.addContact(c2);
		System.out.println("Danh bạ:\n"+list.toString());
		System.out.println("1)Tìm kiếm theo địa chỉ");
		System.out.println("2)Tìm địa chỉ của số điện thoại");
		System.out.println("Nhập chức năng muốn sử dụng:");
		int menu=sc.nextInt();
		switch(menu) {
			case 1:
				sc.nextLine();
				System.out.println("Nhập địa chỉ cần tìm số điện thoại");
				String diachi =sc.nextLine();
				System.out.println("Thông tin: "+diachi+"\n"+list.searchAddress(diachi));		
				break;
			case 2: 
				sc.nextLine();
				System.out.println("Nhập số điện thoại cần tìm địa chỉ");
				int number=sc.nextInt();
				/*
				int[] number =new int[1];
				for(int i=0;i<1;i++) {
					number[i]=sc.nextInt();
				}
				*/
				System.out.println("Thông tin: "+number+"\n"+list.searchNumber(number));		
				break;
			default:
				System.exit(0);
		}

	}

}
