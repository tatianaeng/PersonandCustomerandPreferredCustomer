/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personandcustomerandpreferredcustomer;

/**
 *
 * @author tatianaeng
 */
public class Customer extends Person
{
    // instance fields
    private String number;
    private boolean mailingList;
    
    // constructor
    public Customer(String personName, String personAddress, String personTelephone, 
            String customerNumber, boolean customerMailingList) // bring over the 3 args from the person class and add the args for this customer class
    {
        super(personName, personAddress, personTelephone);
        number = customerNumber;
        mailingList = customerMailingList;
    }
    
    // mutator for the number field
    public void setNumber(String customerNumber)
    {
        number = customerNumber;
    }
    
    // mutator for the mailing list field
    public void setMailingList(boolean customerMailingList)
    {
        mailingList = customerMailingList;
    }
    
    // accessor for the number field
    public String getNumber()
    {
        return number;
    }
    
    // accessor for the mailing list field
    public boolean getMailingList()
    {
        return mailingList;
    }
}
