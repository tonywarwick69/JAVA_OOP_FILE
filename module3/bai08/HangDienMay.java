package bai08;

public class HangDienMay extends HangHoa{
	private int thoiGianBH , congSuat;
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		if (thoiGianBH>=0) {
			this.thoiGianBH = thoiGianBH;
		}
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		if (congSuat>=0) {
			this.congSuat = congSuat;
		}
	}
	public HangDienMay(String maHang, String tenHang, int donGia, int slTon, int thoiGianBH, int congSuat)
	throws Exception {
		super(maHang, tenHang, donGia, slTon);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}
	public HangDienMay() {
	}
	public static String inTieuDe() {
		String s="";
		s+="\nHang Dien May\n";
		s+=HangHoa.inTieuDe();
		s+=String.format("%22s|%15s|\n","Thoi gian bao hanh","Cong suat");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("%22d|%15d|",getThoiGianBH(),getCongSuat());
	}
}
