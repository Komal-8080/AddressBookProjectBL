package addressbook;
import java.util.Scanner;


public class MyMainClass {

	public static void main (String[] args)
	{
		AddressBookManagerImplementation addressBookManager = new AddressBookManagerImplementation();

			int loop = 0;
			while( loop == 0) {
				System.out.println("---------------------------------------------");
				System.out.println("*******WELCOME TO ADDRESS BOOK PROGRAM*******");
				System.out.println("---------------------------------------------");
				System.out.println("1]Create New AddressBook\n"
									+"2]Open AddressBook\n"
									+"3]Save AddressBook\n"
									+"4]Save AddressBook As\n"
									+"5]Close AddressBook\n"
									+"6]Quit");   
				System.out.println("Select from Above Options");
				Scanner input = new Scanner(System.in);
				int option = input.nextInt();
					switch (option)
					{
						case 1:
							addressBookManager.newAddressBook();
								break;
						case 2:
							addressBookManager.openAddressBook();
								break;
						case 3:
							addressBookManager.saveAddressBook();
								break;
						case 4:
							addressBookManager.saveAsAddressBook();
								break;
						case 5:
							addressBookManager.closeAddressBook();
								break;
						case 6:
							loop = 1;
							System.out.println("***** THANK YOU *****");
								break;
						default:
							System.out.println("Invalid Input !!!");
						}
				}
	 	}
}
