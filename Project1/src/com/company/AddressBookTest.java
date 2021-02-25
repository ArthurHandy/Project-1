package com.company;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test AddressBook Test
 */
class AddressBookTest {
    /**
     * TestAdd
     */
    @Test
    void testAdd() {
        AddressBook ab = new AddressBook();
        AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
        ab.add(entry);
        assertEquals(ab.find("Mochi").get(0), entry);
    }

    /**
     * TestReadFromFile
     */
    @Test
    void testReadFromFile() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("C:/Users/Moof Moof/IdeaProjects/Project1/src/AddressInputDataFile.txt");
        assertEquals(ab.getAddressEntryList().size(), 6);
    }

    /**
     * TestRemove
     */
    @Test
    void testRemove() {
        AddressBook ab = new AddressBook();
        AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
        ab.remove(entry);
        assertEquals(ab.find("Mochi").get(0), entry);
    }

    /**
     * Method to test the find method in AddressBook
     */
    @Test
    void testFind() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("C:/Users/Moof Moof/IdeaProjects/Project1/src/AddressInputDataFile.txt");
        AddressEntry entry = ab.find("Handy").get(1);
        assertEquals(entry, ab.getAddressEntryList().get(1));
    }

    /**
     * TestAddressEntryList
     */
    @Test
    void testGetAddressEntryList() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("C:/Users/Moof Moof/IdeaProjects/Project1/src/AddressInputDataFile.txt");
        ArrayList<AddressEntry> entries = ab.getAddressEntryList();
        assertEquals(entries, ab.getAddressEntryList().get(6));
    }
}
