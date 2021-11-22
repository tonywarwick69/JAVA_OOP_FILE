package bai06;

public abstract class PhongHoc {
	private String maphong;
	private String daynha;
	private double dientich;
	private int sobongden;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daynha == null) ? 0 : daynha.hashCode());
		long temp;
		temp = Double.doubleToLongBits(dientich);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((maphong == null) ? 0 : maphong.hashCode());
		result = prime * result + sobongden;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		if (daynha == null) {
			if (other.daynha != null)
				return false;
		} else if (!daynha.equals(other.daynha))
			return false;
		if (Double.doubleToLongBits(dientich) != Double.doubleToLongBits(other.dientich))
			return false;
		if (maphong == null) {
			if (other.maphong != null)
				return false;
		} else if (!maphong.equals(other.maphong))
			return false;
		if (sobongden != other.sobongden)
			return false;
		return true;
	}
	public String datchuan(double dientich,int sobongden) {
		if(sobongden==dientich/10)
			return "Đạt chuẩn";
		else 
			return "Không đạt chuẩn";
	}
	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++)
			s+="-";
		s+=String.format("\n|%-15s|%-15s|%15s|%15s|%15s","Mã phòng","Dãy nhà","Diện tích","Số bóng đèn","Chất lượng");
		return s;
	}
	@Override
	public String toString() {
		return String.format("|%-15s|%-15s|%15s|%15s|%15s",maphong,daynha,dientich,sobongden,datchuan(dientich,sobongden));
	}
	/**
	 * 
	 */
	public PhongHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maphong
	 * @param daynha
	 * @param dientich
	 * @param sobongden
	 */
	public PhongHoc(String maphong, String daynha, double dientich, int sobongden) {
		super();
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.sobongden = sobongden;
	}

	/**
	 * @return the maphong
	 */
	public String getMaphong() {
		return maphong;
	}
	/**
	 * @param maphong the maphong to set
	 */
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	/**
	 * @return the daynha
	 */
	public String getDaynha() {
		return daynha;
	}
	/**
	 * @param daynha the daynha to set
	 */
	public void setDaynha(String daynha) {
		this.daynha = daynha;
	}
	/**
	 * @return the dientich
	 */
	public double getDientich() {
		return dientich;
	}
	/**
	 * @param dientich the dientich to set
	 */
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	/**
	 * @return the sobongden
	 */
	public int getSobongden() {
		return sobongden;
	}
	/**
	 * @param sobongden the sobongden to set
	 */
	public void setSobongden(int sobongden) {
		this.sobongden = sobongden;
	}
	

}
