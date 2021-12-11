package tk1;

public abstract class Person {
	private String name;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
