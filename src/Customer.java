
public class Customer extends Person {
	
	private int customerNumber;
	private boolean optInToMailingList;
	
	public Customer(String name, String address, String cellNumber, int customerNumber, boolean optInToMailingList) {
		super(name, address, cellNumber);
		this.customerNumber = customerNumber;
		this.optInToMailingList = optInToMailingList;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public boolean isOptInToMailingList() {
		return optInToMailingList;
	}

	public void setOptInToMailingList(boolean optInToMailingList) {
		this.optInToMailingList = optInToMailingList;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Customer Number: " + customerNumber + "\nWishes to be On Mailing List: " + optInToMailingList);
	}
	
}
