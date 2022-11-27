package za.ac.cput.cinemabookingsystem.factory.customer;

import org.junit.jupiter.api.Test;
import za.ac.cput.cinemabookingsystem.domain.customer.CustomerAddress;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAddressFactoryTest {

    @Test public void build(){
        CustomerAddress customerAddress = CustomerAddressFactory.build("", "Physical", "Cavendish");
        System.out.println(customerAddress);
        assertNotNull(customerAddress);
    }

    @Test public void builtWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
        CustomerAddressFactory
                .build(null, "Physical", "Cavendish"));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("customer number is required here!" , exceptionMessage);
    }

}