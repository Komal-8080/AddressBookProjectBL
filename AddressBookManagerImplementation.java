package addressbook;
import java.util.Scanner;

	public class AddressBookManagerImplementation implements AddressBookManagerInterface{

	AddressBookImplementation addressBookImplementation = new AddressBookImplementation();

		public void newAddressBook() {


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


		}



		public void closeAddressBook() {


		}
}

