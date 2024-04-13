/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personandcustomerandpreferredcustomer;

/**
 *
 * @author tatianaeng
 */
public class PreferredCustomer extends Customer
{
    // instance fields
    private double purchaseAmount;
    private int discountLevel;
    
    // constructor
    public PreferredCustomer(String personName, String personAddress, String personTelephone, 
            String customerNumber, boolean customerMailingList, 
            double preferredCustomerPurchaseAmount)
    {
        super(personName, personAddress, personTelephone, customerNumber, customerMailingList);
        purchaseAmount = preferredCustomerPurchaseAmount;
    }
    
    // mutator for the purchase amount
    public void setPurchaseAmount(double preferredCustomerPurchaseAmount)
    {
        purchaseAmount = preferredCustomerPurchaseAmount;
    }
    
    // accessor for the purchase amount
    public double getPurchaseAmount()
    {
        return purchaseAmount;
    }
    
    // accessor for the discount level
    public int getDiscountLevel()
    {
        if (purchaseAmount >= 2000)
        {
            discountLevel = 10;
        }
        else if (purchaseAmount >= 1500 && purchaseAmount < 2000)
        {
            discountLevel = 7;
        }
        else if (purchaseAmount >= 1000 && purchaseAmount < 1500)
        {
            discountLevel = 6;
        }
        else if (purchaseAmount >= 500 && purchaseAmount < 1000)
        {
            discountLevel = 5;
        }
        
        return discountLevel;
    }
}
