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
			 // System.out.println("Array of Person : "+personData);

		}


		public void editPerson() {

			System.out.println("Enter person First Name to Edit details");
			Scanner toedit = new Scanner(System.in);
			String firstName = toedit.nextLine();
			boolean exists = false;

			  for (Person p:personData) {
				 // System.out.println(p.toString());

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
						  				switch (num) {
											case 1:
						  						System.out.println("Enter New Phone Number");
						  						String phone = option.nextLine();
						  						p.setPhone(phone);
						  					//	System.out.println(p.toString());
												System.out.println("*****Person Details Edited Successfully*****");
						  						System.out.println("Enter Address Book name to save changes");
						  					  	writeData();
						  						System.out.println("*****Person Details Saved Successfully*****");
												       break;
						  					case 2:
						  						System.out.println("Enter New City Name");
						  						String city = option.nextLine();
						  						p.setCity(city);
						  					//	System.out.println(p.toString());
												System.out.println("*****Person Details Edited Successfully*****");
						  						System.out.println("Enter Address Book name to save changes");
						  						writeData();
						  						System.out.println("*****Person Details Saved Successfully*****");
													break;
						  					case 3:
						  						System.out.println("Enter New State Name");
						  						String state = option.nextLine();
						  						p.setState(state);
						  					//	System.out.println(p.toString());
												System.out.println("*****Person Details Edited Successfully*****");
						  						System.out.println("Enter Address Book name to save changes");
						  					  	writeData();
						  						System.out.println("*****Person Details Saved Successfully*****");
													break;
						  					case 4:
						  						System.out.println("Enter New Zip Code");
						  						String zip = option.nextLine();
						  						p.setZip(zip);
						  					//	System.out.println(p.toString());
												System.out.println("*****Person Details Edited Successfully*****");
						  						System.out.println("Enter Address Book name to save changes");
						  					  	writeData();
						  						System.out.println("*****Person Details Saved Successfully*****");
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

			System.out.println("Enter person First Name to delete details");
			Scanner todelete = new Scanner(System.in);
			boolean delete = false;
			String firstName = todelete.nextLine();

					for (int i=0; i<personData.size(); i++) {
						String name = personData.get(i).firstName;

						if (firstName.equals(name)) {
							delete = true;

								while (delete == true) {
								System.out.println("**Warning: Are you sure you want to delete** \n"
										   +"Enter 1 for yes\n"
										   + "Enter 2 for Quit");
								int entry = todelete.nextInt();

										switch (entry) {
											case 1:
												personData.remove(i);
												readData();
												writeData();
												System.out.println("Person details deleted");
											 		break;
											case 2:
												delete = false;
													break;
											default:
												System.out.println("Invalid Entry");
													break;
										}
							   }
						}

				   else {

					   System.out.println("Record Not Found");

				   }

			   }

		}


		public void sortByName() {

		Collections.sort(personData, new NameComparator());
			System.out.println("Person Details sorted by First Name\n");

				for (Person p:personData) {
					System.out.println(p.toString());

			}
		}


		public void sortByZip() {

		Collections.sort(personData, new NameComparator());
			System.out.println("Person Details sorted by Zip Code\n");

				for (Person p:personData) {
					System.out.println(p.toString());
			}

		}

		public void searchPerson() {

		Scanner tosearch = new Scanner(System.in);
			System.out.println("Enter person phone number to search person details");
			String phone = tosearch.nextLine();

			  	for (Person p:personData) {

					  if (phone.equals(p.phone)) {
						  System.out.println("Person Details are : \n" +p.toString());

					 }
			     }
		}


		public void display(){

			for (Person p:personData) {
				System.out.println(p.toString());

			      }
		}

		public void writeData() {
			final String CSV_HEADER = " firstName, lastName, phone, city, state, zip";
			FileWriter fileWriter = null;
			System.out.println("Enter Address Book name to save person details in Address Book");
			Scanner BookName = new Scanner(System.in);
			String input = BookName.nextLine();
		    try {
		      fileWriter = new FileWriter("C:\\Users\\Gayatri\\eclipse-workspace\\Addressbookjava\\src\\addressbook\\files\\"+input+".csv");
		      fileWriter.append(CSV_HEADER);
		      fileWriter.append('\n');
		      System.out.println("personData"+personData);

			      for (Person p:personData) {
				        fileWriter.append(p.getFirstName());
		        		fileWriter.append(',');
		        		fileWriter.append(p.getLastName());
		        		fileWriter.append(',');
		        		fileWriter.append(p.getPhone());
		        		fileWriter.append(',');
		        		fileWriter.append(p.getCity());
		        		fileWriter.append(',');
		        		fileWriter.append(p.getState());
		        		fileWriter.append(',');
		        		fileWriter.append(p.getZip());
		        		fileWriter.append('\n');
		      		}
		    	}

		    catch (Exception e) {
		      System.out.println("Writing CSV error!");
		      e.printStackTrace();
		    }

		    finally {
		      try {
		      	  fileWriter.flush();
		          fileWriter.close();
		      }

		      catch (IOException e) {
		        System.out.println("Flushing/closing error!");
		        e.printStackTrace();
		      	}
		    }
		}

		public void readData() {

	            final int firstName = 0;
		    final int lastName = 1;
		    final int phone = 2;
		    final int city = 3;
		    final int state = 4;
		    final int zip = 5;
			    BufferedReader fileReader = null;
			    System.out.println("Enter File Name you want to open");
		  	    Scanner BookName = new Scanner(System.in);
		    	    String input = BookName.nextLine();

			    try {

			      String line = "";
			      fileReader = new BufferedReader(new FileReader("C:\\Users\\Gayatri\\eclipse-workspace\\Addressbookjava\\src\\addressbook\\files\\"+input+".csv"));

			      // Read CSV header
			      fileReader.readLine();

			      // Read person data line by line
			      while ((line = fileReader.readLine()) != null) {
			      	  String[] tokens = line.split(",");
			        	if (tokens.length > 0) {
			        	Person p = new Person(tokens[firstName], tokens[lastName], tokens[phone], tokens[city], tokens[state], tokens[zip]);
			    		personData.add(p);
			               }
			      }

			    for (Person p:personData) {
				System.out.println(p.toString());
					      }
			    }
			    catch (Exception e) {
			      System.out.println("Reading CSV Error!");
			      e.printStackTrace();
			    }
			    finally {
			      try {
			        fileReader.close();
			      }
			      catch (IOException e) {
			        System.out.println("Closing fileReader Error!");
			        e.printStackTrace();
			      }
			  }

			public void viewAddressBookList() {

				File dir = new File("C:\\Users\\Gayatri\\eclipse-workspace\\Addressbookjava\\src\\addressbook\\files\\");
	    			File[] list = dir.listFiles();
	    				for(File file : list) {
	    					System.out.println("Address Book:"+file.getName());	
	    			}
			}

}
