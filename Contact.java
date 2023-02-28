package com.address;

public class Contact {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String mail;


    public Contact(String firstName, String lastName, String city, String state, int zip, long phoneNumber, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;

    }
    public void showcontact()
    {
        System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastName);
        System.out.println("mail:"+mail);
        System.out.println("phoneNumber:"+phoneNumber);
        System.out.println("city:" +city);
        System.out.println("state:" +state);
        System.out.println("zip:" +zip);


    }
}
