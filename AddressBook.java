package com.address;

import java.util.Scanner;

public class AddressBook
{
    Contact[] contact = new Contact[10];
    int insertion=3;


    public void addContact()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter last name:");
        String lastName=sc.nextLine();
        System.out.println("Enter e-mail id:");
        String mail=sc.nextLine();
        System.out.println("Enter city:");
        String city=sc.nextLine();
        System.out.println("Enter state:");
        String state=sc.nextLine();
        System.out.println("Enter zip code:");
        int zip=sc.nextInt();
        System.out.println("Enter phoneNumber:");
        long phoneNumber=sc.nextLong();

        contact[insertion] = new Contact(firstName,lastName,city,state,zip,phoneNumber,mail);
        insertion ++;
    }
}
