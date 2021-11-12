package thuaKe;

public class HinhTron extends HinhHoc{
	private double banKinh;
	private final double  PI=3.14;
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) {
		try {
			if(bk>0)
				this.banKinh=bk;
			
		} catch(Exception e) {
			System.out.println(e);
			
		}
	}
	public double getPI() {
		return PI;
	}
	

}
