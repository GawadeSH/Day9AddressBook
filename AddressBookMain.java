package com.address;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        System.out.println("------------------------------------");
        AddressBook book = new AddressBook();

        book.contact[0] = new Contact("Shital","Gawade","KP","MH",1234,9234567762l,"shital@gmail.com");
        book.contact[1] = new Contact("Pratiksha","jagtap","Pune","MH",2136,9212567812l,"pratiksha@gmail.com");
        book.contact[2] = new Contact("Tajal","Shinde","Thane","MH",5321,9234523812l,"tejal@gmail.com");
        book.contact[0].showcontact();
        System.out.println("-------------------------------------");
        book.contact[1].showcontact();
        System.out.println("--------------------------------------");
        book.contact[2].showcontact();
        System.out.println("Add new Contact:");
        book.addContact();
        book.contact[3].showcontact();


    }

}
