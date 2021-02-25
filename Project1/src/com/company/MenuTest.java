package com.company;

import java.io.InputStream;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test MenuTest Class
 */
class MenuTest {

    /**
     * Test prompt_FirstName
     */
    @Test
    void testrompt_FirstName() {
        Menu menu = new Menu();
        String name = "Arthur";
    }

    /**
     * Test prompt_LastName
     */
    @Test
    void testprompt_LastName() {
        Menu menu = new Menu();
        String name = "Handy";
    }


    /**
     * Test prompt_Street
     */
    @Test
    void testprompt_Street() {
        Menu menu = new Menu();
        String street = "123 Valid Blvd";
    }

    /**
     * Test prompt_City
     */
    @Test
    void testprompt_City() {
        Menu menu = new Menu();
        String city = "Fremont";
    }

    /**
     * Test prompt_State
     */
    @Test
    void testprompt_State() {
        Menu menu = new Menu();
        String state = "CA";
    }

    /**
     * Test prompt_Zip
     */
    @Test
    void testprompt_Zip() {
        Menu menu = new Menu();
        String zip = "94544";
    }

    /**
     * Test prompt_Telephone
     */
    @Test
    void testprompt_Phone() {
        Menu menu = new Menu();
        String phone = "555-555-5555";
    }

    /**
     * Test prompt_Email
     */
    @Test
    void testprompt_Email() {
        Menu menu = new Menu();
        String email = "james@doe.com";
    }

    /**
     * Test prompt_Menu
     */
    @Test
    void testPrompt_Menu() {
        Menu menu = new Menu();
        String pick = "f";
    }
}
