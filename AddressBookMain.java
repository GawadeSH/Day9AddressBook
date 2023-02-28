package com.address;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        System.out.println("------------------------------------");
        Contact[] contact = new Contact[10];
        contact[0] = new Contact("Shital","Gawade","KP","MH",1234,9234567762l,"shital@gmail.com");
        contact[1] = new Contact("Pratiksha","jagtap","Pune","MH",2136,9212567812l,"pratiksha@gmail.com");
        contact[2] = new Contact("Tajal","Shinde","Thane","MH",5321,9234523812l,"tejal@gmail.com");
        contact[0].showcontact();
        System.out.println("-------------------------------------");
        contact[1].showcontact();
        System.out.println("--------------------------------------");
        contact[2].showcontact();

    }

}
