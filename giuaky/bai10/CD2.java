package bai10;

import java.text.DecimalFormat;

public class CD2 {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + df.format(giaThanh) + "]";
	}
	public CD2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD2(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD>0)
			this.maCD = maCD;
		else 
			this.maCD=999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD)  throws  Exception {
		if(tuaCD!=null)
			this.tuaCD = tuaCD;
		else
			throw new Exception("chưa xác định");
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat>0)
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat=0;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh>0)
			this.giaThanh = giaThanh;
		else
			this.giaThanh=0;
	}
	DecimalFormat df = new DecimalFormat("#,##0.00");
	

}
