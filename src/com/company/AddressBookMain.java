package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        List<Person> addressBookMain = new LinkedList<>();
        AddressBook addressBook = new AddressBook();
        Person person;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Address Book !");
        boolean isContinoue = true;
        while (isContinoue) {
            System.out.print("\n1. Add Person." +
                    "\n2. View Address Book." +
                    "\n3. Edit details." +
                    "\n4. Exit." +
                    "\n Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    person = addressBook.addPerson();
                    addressBookMain.add(person);
                    break;

                case 2:
                    if (addressBookMain.isEmpty()) {
                        System.out.println("Address Book is Empty.");
                    } else {
                        for (Person details : addressBookMain) {
                            System.out.println(details.toString());
                        }
                    }
                    break;
                case 3:
                    if (addressBookMain.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        addressBookMain = addressBook.editPerson((LinkedList<Person>) addressBookMain);
                    }
                    break;
                case 4:
                    isContinoue=false;
                    System.out.println("Exit.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }
    }
}