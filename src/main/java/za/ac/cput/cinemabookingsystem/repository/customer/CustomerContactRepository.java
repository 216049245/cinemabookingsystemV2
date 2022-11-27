package za.ac.cput.cinemabookingsystem.repository.customer;

import za.ac.cput.cinemabookingsystem.domain.customer.CustomerContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerContactRepository {
    private final List<CustomerContact> customerContactList;
    private static CustomerContactRepository CUSTOMER_CONTACT_REPOSITORY;

    private CustomerContactRepository() {
        this.customerContactList = new ArrayList<>();
    }

    public static CustomerContactRepository getCustomerContactRepository(){
        if (CUSTOMER_CONTACT_REPOSITORY == null)
            CUSTOMER_CONTACT_REPOSITORY = new CustomerContactRepository();
        return CUSTOMER_CONTACT_REPOSITORY;
    }

    public CustomerContact create(CustomerContact customerContact) {

        this.customerContactList.add(customerContact);
        //save into data store and return if successful.
        return customerContact;
    }

    public CustomerContact update(CustomerContact customerContact) {
        Optional<CustomerContact> read = read(customerContact.getCustomerNumber(), customerContact.getContactTypeId());
        if (read.isPresent()) {
            delete(read.get());
            create(customerContact);
        }
        //check if movie exists, if yes, update then return if successful.
        return customerContact;
    }

    public Optional<CustomerContact> read(String customerNumber, String contactTypeId) {
        //find the movie that matches the id and return.
        return this.customerContactList.stream().filter(c -> c.getCustomerNumber().equalsIgnoreCase(customerNumber))
                .filter(g -> g.getContactTypeId().equalsIgnoreCase(contactTypeId))
                .findFirst();
    }

    public void delete(CustomerContact customerContact) {
        this.customerContactList.remove(customerContact);
    }

    public List<CustomerContact> findAll() {
        //return all that is stored.
        return this.customerContactList;
    }
}
