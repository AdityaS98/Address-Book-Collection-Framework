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
public class AddingMultipleAddressBooks {

	public static ArrayList<Contact> toAddAddressBook() {
		ArrayList<Contact> list = new ArrayList<Contact>();
		return list;
	}

	/**
	 * This is main method of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of address book you want to add ");

		int number = sc.nextInt();

		ArrayList<ArrayList> addressbooks = new ArrayList<ArrayList>();

		/*
		 * Creating address book and adding it to main book
		 */
		for (int i = 0; i < number; i++) {
			addressbooks.add(toAddAddressBook());
		}

	}

}
