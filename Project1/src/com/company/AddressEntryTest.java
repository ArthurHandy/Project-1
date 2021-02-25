package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

    /**
    * Test AddressEntryTest
    * @author Arthur Handy
    */
    class AddressEntryTest {

        /**
         * Test testSetFirstName
         */
        @Test
        void testSetFirstName() {
            AddressEntry entry = new AddressEntry();
            String name = "Mochi";
            entry.setFirstName(name);
            assertEquals(entry.getFirstName(), name);
        }

        /**
        * Test testGetFirstName
        */
        @Test
        void testGetFirstName() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getFirstName(), "Mochi");
        }

        /**
        * Test testSetLastName
        */
        @Test
        void testSetLastName() {
            AddressEntry entry = new AddressEntry();
            String name = "Handy";
            entry.setLastName(name);
            assertEquals(entry.getLastName(), name);
        }

        /**
        * Test testGetLastName
        */
        @Test
        void testGetLastName() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getLastName(), "Handy");
        }

        /**
         * Test testSetStreet
         */
        @Test
        void testSetStreet() {
            AddressEntry entry = new AddressEntry();
            String street = "931 Harden Street";
            entry.setStreet(street);
            assertEquals(entry.getStreet(), street);
        }

        /**
         * Test testGetStreet
         */
        @Test
        void testGetStreet() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getStreet(), "931 Harden Street");
        }

        /**
        * Test testSetCity
        */
        @Test
        void testSetCity() {
            AddressEntry entry = new AddressEntry();
            String city = "Fremont";
            entry.setCity(city);
            assertEquals(entry.getCity(), city);
        }

        /**
        * Test testGetCity
        */
        @Test
        void testGetCity() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getCity(), "Fremont");
        }

        /**
        * Test testSetState
        */
        @Test
        void testSetState() {
            AddressEntry entry = new AddressEntry();
            String state = "CA";
            entry.setState(state);
            assertEquals(entry.getState(), state);
        }

        /**
        * Test testGetState
        */
        @Test
        void testGetState() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getState(), "CA");
        }

        /**
        * Test testSetZip
        */
        @Test
        void testSetZip() {
            AddressEntry entry = new AddressEntry();
            int zip = 10293;
            entry.setZip(zip);
            assertEquals(entry.getZip(), zip);
        }

        /**
        * Test testGetZip
        */
        @Test
        void testGetZip() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getZip(), 10293);
        }

        /**
        * Test testSetPhone
        */
        @Test
        void testSetPhone() {
            AddressEntry entry = new AddressEntry();
            String phone = "112-293-3849";
            entry.setPhone(phone);
            assertEquals(entry.getPhone(), phone);
        }

        /**
        * Test testGetPhone
        */
        @Test
        void testGetPhone() {
            AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
            assertEquals(entry.getPhone(), "112-293-3849");
        }

    /**
     * Test testSetEmail
     */
    @Test
    void testSetEmail() {
        AddressEntry entry = new AddressEntry();
        String email = "MochiHandy@gmail.com";
        entry.setEmail(email);
        assertEquals(entry.getEmail(), email);
    }


    /**
     * Test testGetEmail
     */
    @Test
    void testGetEmail() {
        AddressEntry entry = new AddressEntry("Mochi", "Handy", "931 Harden Street", "Fremont", "CA", 10293, "112-293-3849", "MochiHandy@gmail.com");
        assertEquals(entry.getEmail(), "MochiHandy@gmail.com");
    }
}
