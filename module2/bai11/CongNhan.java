package bai11;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int msoSP;
	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CongNhan(String mHo, String mTen, int msoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		this.msoSP = msoSP;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getMsoSP() {
		return msoSP;
	}
	public void setMsoSP(int msoSP) {
		this.msoSP = msoSP;
	}
	public double tinhLuong() {
		if(msoSP>0 && msoSP<=199)
			return msoSP*0.5;
		else if(msoSP>199 && msoSP<=399)
			return msoSP*0.55;
		else if(msoSP>399 && msoSP<=599)
			return msoSP*0.6;
		else if(msoSP>599)
			return msoSP*0.65;
		else 
			return 0;
	}
	public static String getTieuDe() {
		return String.format("%-10s %-20s %-20s %-20s","Họ","Tên","Số sản phẩm","Tiền lương");
		
	}
	@Override
	public String toString() {
		return String.format("%-10s %-20s %-20s %-20s",mHo,mTen,msoSP,tinhLuong());
		
	}
	

}
