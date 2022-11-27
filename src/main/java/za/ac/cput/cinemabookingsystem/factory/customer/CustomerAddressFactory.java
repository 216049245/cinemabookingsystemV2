package za.ac.cput.cinemabookingsystem.factory.customer;

import za.ac.cput.cinemabookingsystem.domain.customer.CustomerAddress;
import za.ac.cput.cinemabookingsystem.helper.StringHelper;

public class CustomerAddressFactory {
    public static CustomerAddress build(String customerNumber, String addressTypeId, String address) {
        StringHelper.checkStringParam("customerNumber", customerNumber);
        StringHelper.checkStringParam("addressTypeId", addressTypeId);
        StringHelper.checkStringParam("address", address);
        return new CustomerAddress.Builder().customerNumber(customerNumber)
                .addressTypeId(addressTypeId).address(address).build();
    }

}