
public class week1 {

	public static void main(String[] args) {
		//create a variable to hold the quantity of available plane seats left on a flight
		int seatsLeft = 13;
		//create a variable to hold the cost of groceries at checkout
		double groceryCost = 48.29;
		//create a variable to hold a person's middle initial
		char midIni = 'W';
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean hotOutside = true;
		//create a variable to hold a customer's first name
		String firstName = "James";
		//create a variable to hold a street address
		int streetNum = 1643;
		String streetName = "SW Jackson Blvd";
		String city = "Flagstaf";
		String state = "WA";
		int zip = 98278;
		String fullAddress = streetNum + " " + streetName + ", " + city + " " + state + " " + zip;
		//print all variables to the console
		System.out.println("There are " + seatsLeft + " seats left on the flight to Spokane.");
		System.out.println("The items on the list will cost $" + groceryCost);
		System.out.println("My friend's middle initial was " + midIni);
		System.out.println("I said it's hot outside and my mom said that I'm " + hotOutside);
		System.out.println("My friend's name is " + firstName);
		System.out.println("I live at " + fullAddress);
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		seatsLeft -= 2;
		System.out.println("\nAfter a recent sale, there are now " + seatsLeft + " seats left to Spokane.");
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceryCost += 2.15;
		System.out.println("Since Snickers was needed for the drive home, the grocery trip ended up costing $" + groceryCost);
		//birth certificate as printed incorre\nctly, change the middle initial to something else
		midIni = 'D';
		System.out.println("His middle initial is now " + midIni);
		//the season has changed, update the hot outside variable to be opposite of what it was
		hotOutside = false;
		System.out.println("I said it'll be hot outside tomorrow and my mom said that I'm " + hotOutside);
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String lastName = "Boburt";
		String fullName = firstName + " " + midIni + " " + lastName;
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("\nThe first sale today was to " + fullName + " who lives at " + fullAddress);
		
		

	}

}
