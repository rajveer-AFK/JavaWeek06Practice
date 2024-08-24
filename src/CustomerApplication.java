
public class CustomerApplication {

	public static void main(String[] args) {
		
		Person [] customerArray = new Person[3];
		
		customerArray[0] = new Customer("Suki", "345345", "234234324", 6969, true);
		customerArray[1] = new Customer("Don", "765755", "45654656", 6970, true);
		customerArray[2] = new Customer("Cody", "867546", "345324523", 6971, false);
		
		for(Person person : customerArray) {
			person.display();
			System.out.println();
		}

	}

}
