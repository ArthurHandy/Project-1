package com.company;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Class that displays the menu options for the user
 * a) Loading of entries from a file
 * b) Addition
 * c) Removal
 * d) Find
 * e) Listing
 * f) Quit
 * @author Arthur Handy
 */
public class Menu {
    /**
     * @return
     * Users enter first name
     * String that returns first name
     */
    public static String prompt_FirstName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("First Name:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter last name
     * String that returns last name
     */
    public static String prompt_LastName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Last Name:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter Street name
     * String that returns Street name
     */
    public static String prompt_Street(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Street:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter City name
     * String that returns City name
     */
    public static String prompt_City(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("City:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter State name
     * String that returns State name
     */
    public static String prompt_State(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("State:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter in Zip Code
     * Int that returns Zip Code
     */
    public static int prompt_Zip(InputStream in) {
        Scanner input = new Scanner(in);
        String zip;
        System.out.println("Zip:");
        System.out.print("> ");
        zip = input.nextLine();
        return Integer.parseInt(zip);
    }

    /**
     * @return
     * Users enter Phone Number
     * String that returns Phone Number
     */
    public static String prompt_Phone(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Phone: xxx-aaa-bbbb");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Users enter Email Address
     * String that returns Email Address
     */
    public static String prompt_Email(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Email:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * @return
     * Menu that shows options
     * a) Loading From File
     * b) Addition
     * c) Removal
     * d) Find
     * e) Listing
     * f) Quit
     * Returns one of the characters a,b,c,d,e,f
     */
    public static char prompt_Menu(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("*************************");
        System.out.println("Please enter in your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("************************");
        System.out.print("> ");
        return input.nextLine().charAt(0);
    }
}
