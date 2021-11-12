package bai01;

public class NgoaiThanh extends ChuyenXe {
	private String noiden;
	private int songaydi;
	public static String getTieuDe() {
		return String.format("%5s %-10s %-10s",ChuyenXe.getTieuDe(),"NƠi đến","Số Kilomet đi được\n" );
	}
	@Override
	public String toString() {
		return String.format("%s %10s %10d", super.toString(),noiden,songaydi);
	}
	public NgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NgoaiThanh(String masochuyen, String tentaixe, double doanhthu, String soxe,String noiden, int songaydi) {
		super(masochuyen,tentaixe,doanhthu,soxe);
		this.noiden = noiden;
		this.songaydi = songaydi;
	}
	public String getNoiden() {
		return noiden;
	}
	public void setNoiden(String noiden) {
		this.noiden = noiden;
	}
	public int getSongaydi() {
		return songaydi;
	}
	public void setSongaydi(int songaydi) {
		this.songaydi = songaydi;
	}
	

}
