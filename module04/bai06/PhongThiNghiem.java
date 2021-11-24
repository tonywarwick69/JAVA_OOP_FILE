package bai06;

public class PhongThiNghiem extends PhongHoc{
	private String chuyennganh;
	private int succhua;
	private boolean bonrua;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (bonrua ? 1231 : 1237);
		result = prime * result + ((chuyennganh == null) ? 0 : chuyennganh.hashCode());
		result = prime * result + succhua;
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
		PhongThiNghiem other = (PhongThiNghiem) obj;
		if (bonrua != other.bonrua)
			return false;
		if (chuyennganh == null) {
			if (other.chuyennganh != null)
				return false;
		} else if (!chuyennganh.equals(other.chuyennganh))
			return false;
		if (succhua != other.succhua)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("|%-15s|%15s|%-15s|",chuyennganh,succhua,checkbonrua(bonrua));
	}
	public static String inTieuDe() {
		String s="";
		s+="Phong Thi Nghiem\n";
		s+=PhongHoc.inTieuDe();
		s+=String.format("|%-15s|%15s|%-15s|\n","Chuyên ngành","Sức chứa","Bồn rửa");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	public String checkbonrua(boolean bonrua) {
		if(bonrua==false)
			return "Không có bồn rửa";
		else
			return "Có bồn rửa";
	}

	/**
	 * @param maphong
	 * @param daynha
	 * @param dientich
	 * @param sobongden
	 * @param chuyennganh
	 * @param succhua
	 * @param bonrua
	 */
	public PhongThiNghiem(String maphong, String daynha, double dientich, int sobongden, String chuyennganh,
			int succhua, boolean bonrua) {
		super(maphong, daynha, dientich, sobongden);
		this.chuyennganh = chuyennganh;
		this.succhua = succhua;
		this.bonrua = bonrua;
	}
	/**
	 * @return the chuyennganh
	 */
	public String getChuyennganh() {
		return chuyennganh;
	}
	/**
	 * @param chuyennganh the chuyennganh to set
	 */
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	/**
	 * @return the succhua
	 */
	public int getSucchua() {
		return succhua;
	}
	/**
	 * @param succhua the succhua to set
	 */
	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}
	/**
	 * @return the bonrua
	 */
	public boolean isBonrua() {
		return bonrua;
	}
	/**
	 * @param bonrua the bonrua to set
	 */
	public void setBonrua(boolean bonrua) {
		this.bonrua = bonrua;
	}

}
