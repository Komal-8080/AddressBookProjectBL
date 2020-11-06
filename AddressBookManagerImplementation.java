package addressbook;
import java.util.Scanner;

	public class AddressBookManagerImplementation implements AddressBookManagerInterface{

	AddressBookImplementation addressBookImplementation = new AddressBookImplementation();

		public void newAddressBook() {

			int newAb = 0;
				while( newAb == 0 ) {

					System.out.println("1] Press 1 to Create New Address Book\n" + "2] Back to Menu");
					Scanner press = new Scanner(System.in);
					int input = press.nextInt();

						switch (input) {
						 	case 1:
						 		System.out.println("Enter Person Details");
						 		addressBookImplementation.addPerson();
		 							int fetchDetails = 0;
		 							while(fetchDetails == 0 ) {
		 								System.out.println("");
		 								System.out.println("1]Enter 1 to Continue\n"+ "2]Enter 2 to Save Address Book" +"3] Enter 3 Back to Menu");
		 								int in = press.nextInt();
						 				switch (in) {
						 					case 1:
						 						addressBookImplementation.addPerson();
						 						System.out.println("");
						 							break;
						 					case 2:
						 						fetchDetails = 1;
						 							break;
						 					default:
						 						System.out.println("Invalid Option");
										 			break;
						 				}

		 							}
						 	case 2:
						 		saveAsAddressBook(); 
						 	case 3:
						 		newAb = 1;
						 		break;
						 	default:
						 		System.out.println("Invalid Option");
						 		break;
						}
				}

		}


		public void openAddressBook() {

			int openAb=0;
			while (openAb == 0) {

					System.out.println("");
					System.out.println("1.Add Person\n" + "2.Edit Person\n" + "3.Delete Person\n" + "4.Sort By Name\n"
									   +"5.Sort By Zip\n" + "6.Search Person\n" + "7.Display\n" + "8.Quit");
					System.out.println("Select from above Options");
					Scanner num = new Scanner(System.in);
					int selectedValue = num.nextInt();

						switch (selectedValue) {
							case 1:
								addressBookImplementation.addPerson();
									break;
							case 2:
								addressBookImplementation.editPerson();
									 break;
							case 3:
								addressBookImplementation.deletePerson();
									break;
							case 4:
								addressBookImplementation.sortByName();
									break;
							case 5:
								addressBookImplementation.sortByZip();
									break;
							case 6:
								addressBookImplementation.searchPerson();
									break;
							case 7:
								addressBookImplementation.display();
									break;
							case 8:
								openAb=1;
									break;
							default:
								System.out.println("Invalid Option");
									break;
							}
					}
		}


		public void saveAddressBook() {


		}


		public void saveAsAddressBook() {

			System.out.println("Enter Address Book name to save person details in Address Book");
 			addressBookImplementation.writeData();
 			System.out.println("!!!Address Book Created Successfully!!!");

		}



		public void closeAddressBook() {


		}
}

