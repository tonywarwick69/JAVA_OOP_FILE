package bai06;

import bai09.Person;

public class PhongLyThuyet extends PhongHoc {
	private boolean maychieu;

	/**
	 * @param maphong
	 * @param daynha
	 * @param dientich
	 * @param sobongden
	 * @param maychieu
	 */
	@Override
	public String toString() {
		return super.toString()+ String.format("|%-15s|",checkMaychieu(maychieu));
	}
	public static String inTieuDe() {
		String s="";
		s+="PhongLyThuyet\n";
		s+=PhongHoc.inTieuDe();
		s+=String.format("|%-15s|\n","Máy chiếu");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	public PhongLyThuyet(String maphong, String daynha, double dientich, int sobongden, boolean maychieu) {
		super(maphong, daynha, dientich, sobongden);
		this.maychieu = maychieu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (maychieu ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongLyThuyet other = (PhongLyThuyet) obj;
		if (maychieu != other.maychieu)
			return false;
		return true;
	}
	public String checkMaychieu(boolean maychieu) {
		if(maychieu==false)
			return "Không máy chiếu";
		else 
			return "Có máy chiếu";
	}

	/**
	 * @return the maychieu
	 */
	public boolean isMaychieu() {
		return maychieu;
	}

	/**
	 * @param maychieu the maychieu to set
	 */
	public void setMaychieu(boolean maychieu) {
		this.maychieu = maychieu;
	}
	
}
