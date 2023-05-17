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
public class AdressBookAddition {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	/*
	 * This is our main method
	 */

	
		public static void main(String[] args)throws IOException {

			System.out.println("Welcome to Address Book Program");
			/*
			 * To create Scanner Object
			 */

			Scanner sc = new Scanner(System.in);

			/*
			 *  To create buffered reader Object
			 */
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			/*
			 * To create address book  by using array list data collection with contact parameter.
			 */
			ArrayList<Contact> addressBook1 = new ArrayList<Contact>();

			/*
			 * To declare choice given by the user
			 */
			int choice;

			/*
			 * Here we are solving to use cases by using do while loop wen the input given by the suer is not equla to zero
			 */
			do {
				System.out.println("1 TO INSERT PERSON DATA IN THE CONTACT");
				System.out.println("0 To Exit FROM THE ADDRESS BOOK");
				choice = sc.nextInt();

				switch(choice) {
				case 1:
					/*
					 * To take details of person to add in address book
					 */
					System.out.println("Enter the  first name");
					String firstName = sc.next();
					System.out.println("Enter the  last name");
					String lastName = sc.next();
					System.out.println("Enter the address");
					String address = sc.next();
					System.out.println("Enter the  city");
					String city = br.readLine();
					System.out.println("Enter the state");
					String state = br.readLine();
					System.out.println("Enter the zip");
					int zip = br.read();
					System.out.println("Enter the phone number");
					String phoneNumber = sc.next();
					System.out.println("Enter the email");
					String email =sc.next();

					/*
					 * To add all information we are taken from user with creating new person object every time we add data
					 *
					 */
					
					addressBook1.add(new Contact(firstName, lastName,address,city,state,zip,phoneNumber,email));
					break;
				case 0:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");

				}
			}while(choice!=0);

			System.out.println(addressBook1);
		

	}

}
