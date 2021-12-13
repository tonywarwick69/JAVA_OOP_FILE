package bai07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Employee nv1= new Programmer(1,"Dong Duc Khang",15000000,"Java");
		Employee nv2 =new ProjectLeader(2,"Truong Cong Thanh",25000000,"Java");
		Employee nv3 = new Admin(3,"Nguyen Thanh Huong",30000000,"Software Development");
		Employee nv4= new Programmer(4,"Tran Phuc An",15000000,"React");
		Employee nv5= new Admin(5,"Tran Huyen Tran",25000000,"Software Testing");
		SoftwareHouse list =new SoftwareHouse();
		
		list.addEmp(nv1);
		list.addEmp(nv2);
		list.addEmp(nv3);
		list.addEmp(nv4);
		list.addEmp(nv5);
	
		System.out.println("Nhập tên công ty:");
		String companyName= sc.nextLine();
		list.setCompanyName(companyName);
		System.out.println("Menu chức năng:");
		System.out.println("1)Xuất danh sách nhân viên của công ty");
		System.out.println("2)Tổng tiền lương phải trả cho nhân viên");
		System.out.println("3)Danh sách programmer");
		System.out.println("4)Danh sách nhân viên theo tên giảm dần Z->A");
		System.out.println("5)Danh sách nhân viên theo tên tăng dần A->Z");
		System.out.println("6)update nhanvien");
		System.out.println("7)Xóa nhân viên");
		System.out.println("8)Tìm theo tên nhân viên");
		System.out.println("0)Thoát");
		System.out.println("Nhập chức năng mong muốn:");
		int number = sc.nextInt();
		switch(number){
			case 1: 
				System.out.println("Danh sách nhân viên:"+list.toString());
				break;
			case 2:
				System.out.println("Tổng tiền lương phải trả cho nhân viên: "+formatter.format(list.getMonthlySalaryBill()));
				break;
			case 3:
				Programmer p = new Programmer();
				System.out.println("Danh sách programmer"+"\n"+p.inTieuDe()+list.getDSProgrammer());
				break;
			case 4:
				System.out.println("Danh sách nhân viên theo tên giảm dần Z->A: "+list.sortHotenGiam());
				break;
			case 5:
				System.out.println("Danh sách nhân viên theo tên tăng dần A->Z: "+list.sortHoTenTang());
				break;
			case 6:
				 nv4= new Programmer(4,"Tran Phuc Toan",14000000,"Python");
				 list.update(4, nv4);
				 System.out.println("Danh sách nv sau update:"+list.toString());
				 break;
			case 7:
				 System.out.println("Nhập mã nhân viên cần xóa");
				 int xoa = sc.nextInt();
				 list.delete(xoa);
				 System.out.println("Danh sau khi xóa nhân viên số: "+ xoa+"\n"+ list.toString());
				 break;
			case 8:
				sc.nextLine();
				System.out.println("Nhập tên nhân viên cần tìm:");
				String ten =sc.nextLine();
				System.out.println("Kết quả tìm kiếm:"+list.search(ten));
				
			default  :
				 System.exit(0);
				 break;
		}
		
		
		
		
		
		
		
		
	}

}
