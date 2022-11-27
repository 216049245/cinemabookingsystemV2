package za.ac.cput.cinemabookingsystem.factory.customer;

import za.ac.cput.cinemabookingsystem.domain.customer.CustomerContact;

public class CustomerContactFactory {
    public static CustomerContact build(String customerNumber, String contactTypeId, String contact){
        if (customerNumber == null || customerNumber.isEmpty())
            throw new RuntimeException("customer number is required here!");
        if (contactTypeId == null || contactTypeId.isEmpty())
            throw new IllegalArgumentException("contact type is required!");
        if (contact == null || contact.isEmpty())
            throw new IllegalArgumentException("contact is required!");
        return new CustomerContact.Builder().customerNumber(customerNumber)
                .contactTypeId(contactTypeId).contact(contact).build();
    }
}
