package za.ac.cput.cinemabookingsystem.domain.customer;

import java.util.Objects;

public class CustomerIdentity {
    private final String customerNumber, identityTypeId, identity;
    private CustomerIdentity(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.identityTypeId = builder.identityTypeId;
        this.identity = builder.identity;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getIdentityTypeId() {
        return identityTypeId;
    }

    public String getIdentity() {
        return identity;
    }

    public static class Builder {
    private String customerNumber, identityTypeId, identity;

    private Builder customerNumber(String customerNumber){
            this.customerNumber = customerNumber;
            return this;
    }

    private Builder identityTypeId(String identityTypeId){
            this.identityTypeId = identityTypeId;
            return this;
    }

    private Builder identity(String identity){
            this.identity = identity;
            return this;
    }
  }
}
