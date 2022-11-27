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

  public Builder copy(CustomerIdentity customerIdentity) {
        this.identityTypeId = customerIdentity.identityTypeId;
        this.customerNumber = customerIdentity.customerNumber;
        this.identity = customerIdentity.identity;
        return this;
        }
    }
@Override
public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    CustomerIdentity that = (CustomerIdentity) o;
    return customerNumber.equals(that.customerNumber) && identityTypeId.equals(that.identityTypeId);
}

@Override
public int hashCode() { return Objects.hash(customerNumber, identityTypeId);

}

    @Override
    public String toString() {
        return "CustomerIdentity{" +
                "customerNumber='" + customerNumber + '\'' +
                ", identityTypeId='" + identityTypeId + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}