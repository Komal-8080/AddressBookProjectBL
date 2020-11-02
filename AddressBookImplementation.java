package addressbook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBookImplementation implements AddressBookInterface {

	public static ArrayList<Person> personData = new ArrayList<Person>();

	 	public void addPerson() {
		     Scanner data = new Scanner(System.in);
				System.out.println("Enter First Name");
			 String firstName = data.nextLine();
				System.out.println("Enter Last Name");
			 String lastName = data.nextLine();
				System.out.println("Enter Phone Number");
			 String phone = data.nextLine();
				System.out.println("Enter City Name");
			 String city = data.nextLine();
				System.out.println("Enter State ");
			 String state = data.nextLine();
				System.out.println("Enter Zip Code");
			 String zip = data.nextLine();
		      Person p = new Person(firstName, lastName, phone, city, state, zip);
		      personData.add(p);
			  System.out.println("Array of Person : "+personData);

		}


		public void editPerson() {


     	  	}


		public void deletePerson() {


		}


		public void sortByName() {


		}


		public void sortByZip() {


		}

		public void searchPerson() {


		}


		public void display(){



		}
}
