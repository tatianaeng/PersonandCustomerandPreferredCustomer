/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personandcustomerandpreferredcustomer;

/**
 *
 * @author tatianaeng
 */
public class Person
{
    // instance fields
    private String name;
    private String address;
    private String telephoneNumber;

    // constructor
    public Person(String personName, String personAddress, String personTelephone)
    {
        name = personName;
        address = personAddress;
        telephoneNumber = personTelephone;
    }
    
    // mutator for the name field
    public void setName(String personName)
    {
        name = personName;
    }
    
    // mutator for the address field
    public void setAddress(String personAddress)
    {
        address = personAddress;
    }
    
    // mutator for the telephone number field
    public void setTelephoneNumber(String personTelephone)
    {
        telephoneNumber = personTelephone;
    }
    
    // accessor for the name field
    public String getName()
    {
        return name;
    }
    
    // accessor for the address field
    public String getAddress()
    {
        return address;
    }
    
    // accessor for the telephone number field
    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }
}
