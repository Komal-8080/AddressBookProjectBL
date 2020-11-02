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

			System.out.println("Enter person First Name to Edit details");
			Scanner toedit = new Scanner(System.in);
			String firstName = toedit.nextLine();
			boolean exists = false;

			  for (Person p:personData) {
				  System.out.println(p.toString());

					  if (firstName.equals(p.firstName)) {
						  exists = true;

						  while (exists == true) {
						  System.out.println("Select an option to edit\n" 
								     +"1] Phone Number\n"
								     +"2] City\n"
								     +"3] State\n"
								     +"4] ZipCode\n"
								     +"5] Quit");

						  		Scanner option = new Scanner(System.in);
						  		int num = option.nextInt();
						  				switch (num) {							  					case 1:
						  						System.out.println("Enter New Phone Number");
						  						String phone = option.nextLine();
						  						p.setPhone(phone);
						  						System.out.println(p.toString());
						  							break;
						  					case 2:
						  						System.out.println("Enter New City Name");
						  						String city = option.nextLine();
						  						p.setCity(city);
						  						System.out.println(p.toString());
						  							break;
						  					case 3:
						  						System.out.println("Enter New State Name");
						  						String state = option.nextLine();
						  						p.setState(state);
						  						System.out.println(p.toString());
						  							break;
						  					case 4:
						  						System.out.println("Enter New Zip Code");
						  						String zip = option.nextLine();
						  						p.setZip(zip);
						  						System.out.println(p.toString());
						  							break;
						  					case 5:
						  						exists = false;
						  							break;
						  					default :
						  						System.out.println("Invalid input");
						  							break;
						  				}
						  		}
					  		}

					  else {
						  			System.out.println("Record Not Found");

					  	}
			        }

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
