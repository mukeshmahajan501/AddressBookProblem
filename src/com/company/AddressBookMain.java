package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        AddressBook addressBook = new AddressBook();
        Person person;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Address Book !");
        boolean isContinoue=true;
        while (isContinoue) {
            System.out.print("\n1. Add Person." +
                    "\n2. View Address Book." +
                    "\n3. Edit details." +
                    "\n4. Delete person." +
                    "\n5. Sort by name." +
                    "\n6. Exit." +
                    "\n Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    person = addressBook.addPerson((LinkedList<Person>) list);
                    list.add(person);
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Address Book is Empty.");
                    } else {
                        for (Person details : list) {
                            System.out.println(details.toString());
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        list = addressBook.editPerson((LinkedList<Person>) list);
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        list = addressBook.deletePerson((LinkedList<Person>) list);
                    }
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        addressBook.sortByName((LinkedList<Person>) list);
                    }
                    break;

                case 6:
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
