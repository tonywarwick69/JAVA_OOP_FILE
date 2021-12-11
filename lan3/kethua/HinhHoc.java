package kethua;

public class HinhHoc {
	private String tenhinh;

	@Override
	public String toString() {
		return "HinhHoc [tenhinh=" + tenhinh + "]";
	}

	/**
	 * 
	 */
	public HinhHoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tenhinh
	 */
	public HinhHoc(String tenhinh) {
		super();
		this.tenhinh = tenhinh;
	}


	/**
	 * @return the tenhinh
	 */
	public String getTenhinh() {
		return tenhinh;
	}

	/**
	 * @param tenhinh the tenhinh to set
	 */
	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}

}
