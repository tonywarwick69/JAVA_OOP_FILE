package bai01;

public class TestChuyenXe extends ChuyenXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoiThanh nt1=new NoiThanh("NT1","Khang",2000000,"50V8",27,175.5);
		NoiThanh nt2=new NoiThanh("NT2","Long",3000000,"52Z7",31,255.3);
		System.out.printf("%5s %-25s %10s %10s %10s %10s","Mã số chuyến","Họ tên tài xế","Số xe","Doanh thu","Số tuyến","Số Kilomet đã đi\n");
		System.out.println(nt1);
		System.out.println(nt2);
	}

}
