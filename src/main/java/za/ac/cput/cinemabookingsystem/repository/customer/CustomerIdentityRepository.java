package za.ac.cput.cinemabookingsystem.repository.customer;

import za.ac.cput.cinemabookingsystem.domain.customer.CustomerContact;
import za.ac.cput.cinemabookingsystem.domain.customer.CustomerIdentity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerIdentityRepository {

    private final List<CustomerIdentity> customerIdentityList;
    private static CustomerIdentityRepository CUSTOMER_IDENTITY_REPOSITORY;

    private CustomerIdentityRepository() {
        this.customerIdentityList = new ArrayList<>();
    }

    public static CustomerIdentityRepository getRepository(){
        if (CUSTOMER_IDENTITY_REPOSITORY == null)
            CUSTOMER_IDENTITY_REPOSITORY = new CustomerIdentityRepository();
        return CUSTOMER_IDENTITY_REPOSITORY;
    }

    public CustomerIdentity save(CustomerIdentity customerIdentity) {
        Optional<CustomerIdentity> read = read(customerIdentity.getCustomerNumber(), customerIdentity.getIdentityTypeId());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.customerIdentityList.add(customerIdentity);
        return customerIdentity;
    }

    public Optional<CustomerIdentity> read(String customerNumber, String contactTypeId) {
        //find the movie that matches the id and return.
        return this.customerIdentityList.stream().filter(c -> c.getCustomerNumber().equalsIgnoreCase(customerNumber))
                .findFirst();
    }

    public void delete(CustomerIdentity customerIdentity) {
        this.customerIdentityList.remove(customerContact);
    }

    public List<CustomerIdentity> findByEmployeeNumber(String customerNumber) {
        return this.customerIdentityList.stream()
                .filter(c -> c.getCustomerNumber().equalsIgnoreCase(customerNumber))
                .collect(Collectors.toList());
    }
}
