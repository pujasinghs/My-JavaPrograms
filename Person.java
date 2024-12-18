package My_Package;

public class Person {

	String name;
	String address;
	long phone;
	Person father;
	Person mother;

	Person(String name, String address, long phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	Person(String name, String address, long phone, Person father, Person mother) {
		this(name, address, phone);
		this.father = father;
		this.mother = mother;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

}
