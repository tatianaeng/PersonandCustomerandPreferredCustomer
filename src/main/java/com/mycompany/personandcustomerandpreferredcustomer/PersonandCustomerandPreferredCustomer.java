/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personandcustomerandpreferredcustomer;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class PersonandCustomerandPreferredCustomer
{

    public static void main(String[] args)
    {
        // create a customer object
        Customer customer1 = makeCustomer();
        
        // display the object
        System.out.println("\nCustomer information:");
        displayCustomer(customer1);
        System.out.println();
        
        // change at least one field
        customer1.setAddress("212 Fifth Ave");
        
        // display the updated object
        System.out.println("Updated customer information:");
        displayCustomer(customer1);
        System.out.println();
        
        // create a preferred customer object
        PreferredCustomer preferredCustomer1 = makePreferredCustomer();
        
        // display the object
        System.out.println("\nPreferred customer information:");
        displayPreferredCustomer(preferredCustomer1);
        
        // change one field from the person class
        preferredCustomer1.setName("Dory");
        
        // change one field from the customer class
        preferredCustomer1.setNumber("789");
        
        // display the updated object
        System.out.println("\nUpdated preferred customer information:");
        displayPreferredCustomer(preferredCustomer1);
        System.out.println();
    }
    
    // method to display the customer object
    public static void displayCustomer(Customer object)
    {
        String name, address, telephoneNumber;  // instance fields from the person class
        String number;                          // instance field from the customer class
        boolean mailingList;                    // intance field from the customer class
        
        // call the accessor methods
        name = object.getName();
        address = object.getAddress();
        telephoneNumber = object.getTelephoneNumber();
        number = object.getNumber();
        mailingList = object.getMailingList();
        
        // display customer info
        System.out.printf("Name: %s\nAddress: %s\nTelephone number: %s\nCustomer account number: %s\nMailing list: %b\n",
                name, address, telephoneNumber, number, mailingList);
    }
    
    // method to make a customer object
    public static Customer makeCustomer()
    {
        // instance fields from the person and customer classes
        String name, address, telephoneNumber;
        String number;
        boolean mailingList;
        
        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for the customer name, address, telphone number, customer number, and mailing list choice... then read user input
        System.out.println("What is the customer's name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the customer's address?");
        address = keyboard.nextLine();
        
        System.out.println("What is the customer's telephone number?");
        telephoneNumber = keyboard.nextLine();
      
        System.out.println("What is the customer account number?");
        number = keyboard.nextLine();
        
        System.out.println("Does the customer wish to be on the Philz Coffee mailing list? Type 'true' for yes or 'false' for no.");
        mailingList = keyboard.nextBoolean();
        
        // create a new customer record
        Customer newCustomer = new Customer(name, address, telephoneNumber, number, mailingList);
        return newCustomer;
    }
    
    // method to display the preferred customer object
    public static void displayPreferredCustomer(PreferredCustomer object)
    {
        String name, address, telephoneNumber;  // instance fields from the person class
        String number;                          // instance field from the customer class
        boolean mailingList;                    // intance field from the customer class
        double purchaseAmount;                  // instance field from the preferred customer class
        int discountLevel;                      // instance field from the preferred customer class
        
        // call the accessor methods
        name = object.getName();
        address = object.getAddress();
        telephoneNumber = object.getTelephoneNumber();
        number = object.getNumber();
        mailingList = object.getMailingList();
        purchaseAmount = object.getPurchaseAmount();
        discountLevel = object.getDiscountLevel();
        
        // display preferred customer info
        System.out.printf("Name: %s\nAddress: %s\nTelephone number: %s\nCustomer account number: %s\nMailing list: %b\nPurchase amount: $%,.2f\nDiscount level: %d percent\n",
                name, address, telephoneNumber, number, mailingList, purchaseAmount, discountLevel);
    }
    
    // method to make a preferred customer object
    public static PreferredCustomer makePreferredCustomer()
    {
        // instance fields from the person, customer, and preferred customer classes (*with the exception of discountLevel)
        String name, address, telephoneNumber; 
        String number;                          
        boolean mailingList; 
        double purchaseAmount;
        
        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for the customer name, address, telphone number, customer number, and mailing list choice... then read user input
        System.out.println("What is the preferred customer's name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the preferred customer's address?");
        address = keyboard.nextLine();
        
        System.out.println("What is the preferred customer's telephone number?");
        telephoneNumber = keyboard.nextLine();
      
        System.out.println("What is the preferred customer account number?");
        number = keyboard.nextLine();
        
        System.out.println("Does the preferred customer wish to be on the Philz Coffee mailing list? Type 'true' for yes or 'false' for no.");
        mailingList = keyboard.nextBoolean();
        
        // ask user for the purchase amount and read user input
        System.out.println("What is the preferred customer's cumulative spend at Philz Coffee?");
        purchaseAmount = keyboard.nextDouble();
        
        // create a new preferred customer record
        PreferredCustomer newPreferredCustomer = new PreferredCustomer(name,
                address, telephoneNumber, number, mailingList, purchaseAmount);
        return newPreferredCustomer;
    }
}
