package za.ac.cput.cinemabookingsystem.domain.customer;

public class CustomerAddress {
    private final String customerNumber, addressTypeId, address;
    private CustomerAddress(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.addressTypeId = builder.addressTypeId;
        this.address = builder.address;
    }

    public String getCustomerNumber() { return customerNumber; }

    public String getAddressTypeId() { return addressTypeId; }

    public String getAddress() { return address; }

    public static class Builder{
    private String customerNumber, addressTypeId, address;

    public Builder customerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public Builder addressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Builder copy(CustomerAddress customerAddress) {
        this.addressTypeId = customerAddress.addressTypeId;
        this.customerNumber = customerAddress.customerNumber;
        this.address = customerAddress.address;
        return this;
    }

    public CustomerAddress build() {
        return new CustomerAddress(this);
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass())return false;
            CustomerAddress that = (CustomerAddress) o;
            return customerNumber.equals(that.customerNumber) && addressTypeId.equals(that.addressTypeId);
        }


  }
}