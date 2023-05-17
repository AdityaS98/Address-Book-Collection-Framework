package com.CollectionFramework;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author DELL
 *
 */

public class AddressbookEdit {
	/**
	 * 
	 * @param args
	 */

	public class AddressBookMain {

		/**
		 * This is main method of program
		 * 
		 * @param args
		 * @throws IOException
		 */

		public static void main(String[] args) throws IOException {

			System.out.println("Welcome to Address Book Program");
			/*
			 * Scanner Object
			 */

			Scanner sc = new Scanner(System.in);

			/*
			 * To create buffered reader
			 */
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

			/*
			 * To create address book by using array list data collection with Contact Parameter
			 */
			ArrayList<Contact> addressBook1 = new ArrayList<Contact>();

			/*
			 * To declare choice
			 */
			int choice;

			/*
			 * Here we are solving to use cases by using do while loop we can add data
			 */
			do {
				System.out.println("1 TO INSERT PERSON DATA IN THE ADDRESS BOOK");
				System.out.println("2 TO EDIT PERSON DATA IN ADDREES BOOK");
				System.out.println("0 To Exit");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					/*
					 * To take data of person to add in address book
					 */
					System.out.println("Enter first name");
					String firstName = sc.next();
					System.out.println("Enter last name");
					String lastName = sc.next();
					System.out.println("Enter address");
					String address = sc.next();
					System.out.println("Enter city");
					String city = br.readLine();
					System.out.println("Enter state");
					String state = br.readLine();
					System.out.println("Enter zip");
					int zip = br.read();
					System.out.println("Enter phone number");
					String phoneNumber = sc.next();
					System.out.println("Enter email");
					String email = sc.next();

					/*
					 * To add all information we are taken from user with creating new person object
					 * every time we add data
					 */
					addressBook1.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
					break;
				case 2:
					/*
					 * This case will check for person name in address book and update it if it
					 * found name or report that person information is not found
					 */
					System.out.println("Enter person's first name to serch it and edit the data");
					String name = br1.readLine();
					/*
					 * To find person name in address book
					 */
					for (int i = 0; i < addressBook1.size(); i++) {
						if (addressBook1.get(i).getFirstName().equals(name)) {
							System.out.println("Person found please enter new data");
							System.out.println("Enter first name");
							String firstName1 = br1.readLine();
							System.out.println("Enter last name");
							String lastName1 = br1.readLine();
							System.out.println("Enter address");
							String address1 = br1.readLine();
							System.out.println("Enter city");
							String city1 = br1.readLine();
							System.out.println("Enter state");
							String state1 = br1.readLine();
							System.out.println("Enter zip");
							int zip1 = br1.read();
							System.out.println("Enter phone number");
							String phoneNumber1 = sc.next();
							System.out.println("Enter email");
							String email1 = sc.next();
							/*
							 * To set edited data at the given format in the addressbook
							 */
							addressBook1.set(i, new Contact(firstName1, lastName1, address1, city1, state1, zip1,
									phoneNumber1, email1));
							System.out.println("Information updated successfully in the address book");

						} else {
							System.out.println("Person not found in the address book");

						}
					}
					break;

				case 0:
					/*
					 * If you put zero as choice you will be exit from the switch statements
					 */
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");

				}
			} while (choice != 0);

			System.out.println(addressBook1);
		}
	}

}
