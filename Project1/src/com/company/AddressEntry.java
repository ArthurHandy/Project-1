package com.company;

/**
 * AddressEntry Class represents a single Address/Contact information entry in the AddressBook
 * AddressEntry Class will print out
 * firstName lastName
 * street
 * city, state zip
 * email
 * phone
 * @author Arthur Handy
 */
public class AddressEntry {
    /**
     * User first name
     */
    private String firstName;

    /**
     * User last name
     */
    private String lastName;

    /**
     * User street name
     */
    private String street;

    /**
     * User city name
     */
    private String city;

    /**
     * User state
     */
    private String state;

    /**
     * User zip code
     */
    private int zip;

    /**
     * User phone number
     */
    private String phone;

    /**
     * User Email Address
     */
    private String email;

    /**
     * Default Constructor
     */
    AddressEntry() {}

    /**
     *
     * @param firstName
     * @param lastName
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param email
     */
    AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * @param firstName
     * Setting Address Entry of first name to string first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     * Returning Address Entry string first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param lastName
     * Setting Address Entry of last name to string last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     * Returning Address Entry String last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param street
     * Setting Address Entry of Street to String Street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     * Returning Address Entry String Street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param city
     * Setting Address Entry of city to string city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return
     * Returning Address Entry String city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param state
     * Setting Address Entry of State to string State
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * Returning Address Entry String State
     */
    public String getState() {
        return state;
    }

    /**
     * @param zip
     * Setting Address Entry of Zip to int Zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * @return
     * Returning Address Entry int Zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param phone
     * Setting Address Entry of Phone to String Phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return
     * Returning Address Entry String Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param email
     * Setting Address Entry of Email to String Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     * Returning Address Entry String Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return
     * firstName lastName
     * street
     * city, state zip
     * email
     * phone
     */
    public String toString() {
        return firstName + " " + lastName + "\n" +
                street + "\n" +
                city + ", " + state + " " + zip + "\n" +
                email + "\n" +
                phone + "\n";
    }
}

