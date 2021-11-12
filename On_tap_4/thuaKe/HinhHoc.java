package thuaKe;

public class HinhHoc {
	protected String tenHinh;
	//Đóng gói(Encapsulation)
	//Che dấu bảo vệ ràng buộc tránh truy xuất trực tiếp đến thuộc tính
	//Không cho truy xuất trực tiếp chỉ cho truy xuất gián tiếp 
	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String ten) {
		if(ten!=null) {
			this.tenHinh=ten;
		} else {
			this.tenHinh = ten;
		}
		
	}
	public HinhHoc() {
		//Tính chất thừa kế
		//Một class B thừa hưởng thuộc tính và phương thức từ class A
		// thì ta gọi class B thừa kế class A. Class B gọi là class con, class A là class cha
		//A là lớp cơ sở, B là lớp dẫn xuất
	}
//Tính chất da hình: các đối tượng khác nhay có cùng kiểu dữ liệu thể hiện nhiều hình thác khác nhau
}
