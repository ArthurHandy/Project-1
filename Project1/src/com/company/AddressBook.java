package com.company;
import java.util.ArrayList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Class AddressBook that will list, remove, add, readFromFile, and find.
 */
public class AddressBook {

    private ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * Printing list in alphabetic order by last name and print out AddressBook in numeric order
     */
    public void list() {

        // Sorting in Alphabetic order by last name
        addressEntryList.sort(Comparator.comparing(AddressEntry::getLastName));

        // Printing Address Entry data from 1 - #
        for (int i = 1; i <= addressEntryList.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(addressEntryList.get(i-1).toString());
        }
    }

    /**
     * @param entry
     * Remove AddressEntry Array object from AddressBook
     */
    public void remove(AddressEntry entry) {

        addressEntryList.remove(entry);

    }

    /**
     * @param entry
     * Adding AddressEntry Array object from AddressBook
     */
    public void add(AddressEntry entry) {

        addressEntryList.add(entry);

    }

    /**
     * @param location
     * Reading from file and creating an AddressEntry object to add to AddressBook
     * String location is used to determine the location of the file being read
     */
    public void readFromFile(String location) {
        try {
            ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(location)));

            for (String info: list) {
                AddressEntry entry = new AddressEntry();
                ArrayList<String> entryList = new ArrayList<>(Arrays.asList(info.split(",")));
                entry.setFirstName(entryList.get(0).trim());
                entry.setLastName(entryList.get(1).trim());
                entry.setStreet(entryList.get(2).trim());
                entry.setCity(entryList.get(3).trim());
                entry.setState(entryList.get(4).trim());
                entry.setZip(Integer.parseInt(entryList.get(5).trim()));
                entry.setPhone(entryList.get(6).trim());
                entry.setEmail(entryList.get(7).trim());
                add(entry);
            }

            System.out.println("Read in " + list.size() + " new Addresses, successfully loaded, currently " + addressEntryList.size() + " Addresses");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }


    /**
     * @param startOf_lastName
     * String startOf_lastName shows the last name alphabetically
     *
     * @return the AddressEntry object(s) which contains lastName === startOf_lastName
     * Returns last name alphabetically
     */
    public ArrayList<AddressEntry> find(String startOf_lastName) {
        ArrayList<AddressEntry> FindLastName = new ArrayList<>();

        for (int i = 0; i < addressEntryList.size(); i++) {
            if (addressEntryList.get(i).getLastName().toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                FindLastName.add(addressEntryList.get(i));
            }
        }

        return FindLastName;
    }

    /**
     * @return
     * Returning AddressEntryList
     */
    public ArrayList<AddressEntry> getAddressEntryList() {

        return addressEntryList;

    }
}
