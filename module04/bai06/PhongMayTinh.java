package bai06;

public class PhongMayTinh extends PhongHoc {
	private int somaytinh;

	@Override
	public String toString() {
		return super.toString()+ String.format("|%-15s|",checkSoMay(dientich,somaytinh));
	}
	public static String inTieuDe() {
		String s="";
		s+="Phong May Tinh\n";
		s+=PhongHoc.inTieuDe();
		s+=String.format("|%-15s|\n","Số máy tính");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	public String checkSoMay(double dientich, int somaytinh) {
		if(somaytinh>=dientich/1.5)
			return "Phòng đủ máy tính";
		else 
			return "Phòng không đủ máy";
	}

	/**
	 * 
	 */
	public PhongMayTinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maphong
	 * @param daynha
	 * @param dientich
	 * @param sobongden
	 */
	public PhongMayTinh(String maphong, String daynha, double dientich, int sobongden) {
		super(maphong, daynha, dientich, sobongden);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maphong
	 * @param daynha
	 * @param dientich
	 * @param sobongden
	 * @param somaytinh
	 */
	public PhongMayTinh(String maphong, String daynha, double dientich, int sobongden, int somaytinh) {
		super(maphong, daynha, dientich, sobongden);
		this.somaytinh = somaytinh;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + somaytinh;
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
		PhongMayTinh other = (PhongMayTinh) obj;
		if (somaytinh != other.somaytinh)
			return false;
		return true;
	}

	/**
	 * @return the somaytinh
	 */
	public int getSomaytinh() {
		return somaytinh;
	}

	/**
	 * @param somaytinh the somaytinh to set
	 */
	public void setSomaytinh(int somaytinh) {
		this.somaytinh = somaytinh;
	}

}
