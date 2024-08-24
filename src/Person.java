
public class Person {
	
	private String name;
	private String address;
	private String cellNumber;
	
	
	public Person(String name, String address, String cellNumber) {
		
		this.name = name;
		this.address = address;
		this.cellNumber = cellNumber;
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

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	
	public void display() {
		System.out.println("Name: " + name + "\nAddress: " + address + "\nCell Number: " + cellNumber);
	}
	
}
