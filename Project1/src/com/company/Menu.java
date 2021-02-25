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
        String firstname = " ";
        System.out.println("First Name:");
        System.out.print("> ");
        firstname = input.nextLine();

        while(firstname.isEmpty()){
            System.out.print("Error! Enter valid first name: ");
            firstname = input.nextLine();
        }
        return firstname;
    }

    /**
     * @return
     * Users enter last name
     * String that returns last name
     */
    public static String prompt_LastName(InputStream in) {
        Scanner input = new Scanner(in);
        String lastname = " ";
        System.out.println("First Name:");
        System.out.print("> ");
        lastname = input.nextLine();

        while(lastname.isEmpty()){
            System.out.print("Error! Enter valid last name: ");
            lastname = input.nextLine();
        }
        return lastname;
    }

    /**
     * @return
     * Users enter Street name
     * String that returns Street name
     */
    public static String prompt_Street(InputStream in) {
        Scanner input = new Scanner(in);
        String street = " ";
        System.out.println("Street:");
        System.out.print("> ");
        street = input.nextLine();

        while(street.isEmpty()){
            System.out.print("Error! Enter valid street name: ");
            street = input.nextLine();
        }
        return street;
    }

    /**
     * @return
     * Users enter City name
     * String that returns City name
     */
    public static String prompt_City(InputStream in) {
        Scanner input = new Scanner(in);
        String city = " ";
        System.out.println("City:");
        System.out.print("> ");
        city = input.nextLine();

        while(city.isEmpty()){
            System.out.print("Error! Enter city name: ");
            city = input.nextLine();
        }
        return city;
    }

    /**
     * @return
     * Users enter State name
     * String that returns State name
     */
    public static String prompt_State(InputStream in) {
        Scanner input = new Scanner(in);
        String state = " ";
        System.out.println("State:");
        System.out.print("> ");
        state = input.nextLine();

        while(state.isEmpty()){
            System.out.print("Error! Enter valid state name: ");
            state = input.nextLine();
        }
        return state;
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
        String phone = " ";
        System.out.println("Phone: xxx-aaa-bbbb");
        System.out.print("> ");
        phone = input.nextLine();

        while(phone.isEmpty()){
            System.out.print("Error! Enter valid phone number: ");
            phone = input.nextLine();
        }
        return phone;
    }

    /**
     * @return
     * Users enter Email Address
     * String that returns Email Address
     */
    public static String prompt_Email(InputStream in) {
        Scanner input = new Scanner(in);
        String email = " ";
        System.out.println("Email:");
        System.out.print("> ");
        email = input.nextLine();

        while(email.isEmpty()){
            System.out.print("Error! Enter valid email Address: ");
            email = input.nextLine();
        }
        return email;
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
