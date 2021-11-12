package dongGoi;

public class HInhHoc {
	private String tenHinh;
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
	

}
