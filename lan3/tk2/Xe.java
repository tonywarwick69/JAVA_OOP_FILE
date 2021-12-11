package tk2;

public class Xe {
	private String chuxe;
	private String nhanhieu;
	private double trigiaxe;
	private String bienso;
	private int dungtich;
	/**
	 * @return the chuxe
	 */
	public String getChuxe() {
		return chuxe;
	}
	/**
	 * @param chuxe the chuxe to set
	 */
	public void setChuxe(String chuxe) throws Exception {
		if(!chuxe.isEmpty())
			this.chuxe = chuxe;
		else
			throw new Exception("Tển chủ xe không được rỗng");
	}
	/**
	 * @return the nhanhieu
	 */
	public String getNhanhieu() {
		return nhanhieu;
	}
	/**
	 * @param nhanhieu the nhanhieu to set
	 */
	public void setNhanhieu(String nhanhieu) {
		this.nhanhieu = nhanhieu;
	}
	/**
	 * @return the trigiaxe
	 */
	public double getTrigiaxe() {
		return trigiaxe;
	}
	/**
	 * @param trigiaxe the trigiaxe to set
	 */
	public void setTrigiaxe(double trigiaxe) {
		this.trigiaxe = trigiaxe;
	}
	/**
	 * @return the bienso
	 */
	public String getBienso() {
		return bienso;
	}
	/**
	 * @param bienso the bienso to set
	 */
	public void setBienso(String bienso) {
		this.bienso = bienso;
	}
	/**
	 * @return the dungtich
	 */
	public int getDungtich() {
		return dungtich;
	}
	/**
	 * @param dungtich the dungtich to set
	 */
	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

}
