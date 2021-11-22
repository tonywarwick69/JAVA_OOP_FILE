package bai08;

public abstract class HangHoa {
	protected String maHang, tenHang;
	protected int donGia,slTon;
	public String getMaHang() {
	return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if(maHang != null)
			this.maHang = maHang;
		else
			throw new Exception("maHang khong Rong");
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang){
		if(tenHang.equals(""))
			this.tenHang = "xxx";
		else
			this.tenHang=tenHang;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) throws Exception {
		if(donGia>=0)
			this.donGia = donGia;
		else
			throw new Exception("donGia >= 0");
	}
	public int getSlTon() {
		return slTon;
	}
	public void setSlTon(int slTon) throws Exception {
		if(slTon >= 0)
			this.slTon = slTon;
		else
			throw new Exception("slTon >= 0");
	}
	public HangHoa() {
	}
	public HangHoa(String maHang, String tenHang, int donGia, int slTon) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSlTon(slTon);
	}
	public static String inTieuDe() {
		String s="";
		for(int i=0;i<120;i++)
			s+="-";
		s+=String.format("\n|%-15s|%-15s|%15s|%15s|","Ma Hang","Ten Hang","Don Gia","Sl Ton");
		return s;
	}
	@Override
	public String toString() {
		return String.format("|%-15s|%-15s|%15s|%15s|",getMaHang(),getTenHang(),getDonGia(),getSlTon());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
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
		HangHoa other = (HangHoa) obj;
		if (maHang == null) {
			if (other.maHang != null)
				return false;
		} else if (!maHang.equals(other.maHang))
			return false;
			return true;
	}
}
