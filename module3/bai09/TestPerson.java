package bai09;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p1 = new Student("Dong Duc Khang","Tân Bình",8,9);
		Person p2 = new Employee("Tran Hoang Long","Gò Vấp",3);
		Person p3 = new Customer("Nguyen Anh Thu","Gò Vấp","Phúc Long",50000);
		Management list = new Management();
		list.addPerson(p1);
		list.addPerson(p2);
		list.addPerson(p3);
		System.out.println(list.toString());
		System.out.println("Nhập tên cần tìm:");
		String personName =sc.nextLine();
		System.out.println("Kết quả "+personName);
		
		System.out.println(list.searchPerson(personName));
		System.out.println("Nhập tên cần xóa:");
		String personName2 =sc.nextLine();
		list.deletePerson(personName2);
		System.out.println("Danh sách sau xóa:\n"+list.toString());

	}

}
