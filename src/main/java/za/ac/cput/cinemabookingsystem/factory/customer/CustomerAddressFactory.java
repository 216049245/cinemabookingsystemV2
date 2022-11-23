package za.ac.cput.cinemabookingsystem.factory.customer;

import za.ac.cput.cinemabookingsystem.domain.customer.CustomerAddress;

public class CustomerAddressFactory {
        public static CustomerAddress build(String customerNumber, String addressTypeId, String address) {
            return new CustomerAddress.Builder().customerNumber(customerNumber)
                    .addressTypeId(addressTypeId).address(address).build();
    }
}
