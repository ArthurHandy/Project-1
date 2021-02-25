package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class AddressBookApplication contains the main application class. Uses Menu classes and AddressBook
 * @author Arthur Handy
 */
public class AddressBookApplication {
    /**
     * @param args
     * Main
     */
    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        char pick = Menu.prompt_Menu(System.in);

        while (pick != 'f') {
            switch(pick) {
                case 'a':
                    readFromFile(ab);
                    break;
                case 'b':
                    addEntry(ab);
                    break;
                case 'c':
                    removeEntry(ab);
                    break;
                case 'd':
                    findEntry(ab);
                    break;
                case 'e':
                    ab.list();
                    break;
                default:
                    System.out.println("Error! Please select on of the following: a,b,c,d,e,f");
                    break;
            }

            pick = Menu.prompt_Menu(System.in);
        }

        if (pick == 'f') {
            System.out.println("Goodbye!");
        }
    }

    /**
     * @param ab
     * Removes data from AddressBook
     */
    private static void removeEntry(AddressBook ab) {
        int pick;
        char Remove;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter in Last Name of contact to remove:");
        System.out.print("> ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = ab.find(lastName);

        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(result.get(i-1));
        }

        System.out.println("The following " + result.size() + " entries were found in the address book, select number");
        System.out.println("of entry you wish to remove:");


        System.out.print("> ");
        pick = Integer.parseInt(input.nextLine());

        if (pick < 0)
        {
            System.out.println("Error! Pick Again.");
            System.out.print("> ");
            pick = Integer.parseInt(input.nextLine());
        };

        System.out.println("Hit y to remove the following entry or n to return to main menu:");
        System.out.println(result.get(pick-1));
        System.out.print("> ");
        Remove = input.next().charAt(0);

        if (Remove == 'y') {
            AddressEntry contact = result.get(pick-1);
            ab.remove(contact);
            System.out.println("You have successfully removed the " + contact.getFirstName() + " " + contact.getLastName() + " contact");
        }

        if (Remove == 'n') {
            System.out.println("Returning to main menu: ");
        }

    }

    /**
     * @param ab
     * Adding data to AddressEntry
     */
    private static void addEntry(AddressBook ab) {
        AddressEntry entry = new AddressEntry();
        String firstName; String lastName;
        String street;
        String city; String state; int zip;
        String phone;
        String email;

        firstName = Menu.prompt_FirstName(System.in);
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName(System.in);
        entry.setLastName(lastName);

        street = Menu.prompt_Street(System.in);
        entry.setStreet(street);

        city = Menu.prompt_City(System.in);
        entry.setCity(city);

        state = Menu.prompt_State(System.in);
        entry.setState(state);

        zip = Menu.prompt_Zip(System.in);
        entry.setZip(zip);

        phone = Menu.prompt_Phone(System.in);
        entry.setPhone(phone);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        ab.add(entry);

        System.out.println("Thank you! The following contact has been added to your address book:");
        System.out.println(entry.toString());
    }

    /**
     * @param ab
     * Reads filename
     */
    private static void readFromFile(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in filename:");
        System.out.print("> ");
        ab.readFromFile(input.nextLine());
    }

    /**
     * @param ab
     * Searching by last name in AddressBook
     */
    private static void findEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in all or the beginning of the Last Name of the contact you wish to find:");
        System.out.print("> ");

        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = ab.find(lastName);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(i+1 + ": " + result.get(i).toString());
        }

        if (result.size() > 0) {
            System.out.println("The following " + result.size() + " entries were found in the address book for a last name starting with '" + lastName +"'");
        }

        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(result.get(i-1));
        }

        if (result.size() < 0) {
            System.out.println("No entries found.");
        }
    }

}
