package za.ac.cput.cinemabookingsystem.domain.customer;

import java.util.Objects;

public class CustomerContact {

    private final String customerNumber, contactTypeId, contact;
    private CustomerContact(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.contactTypeId = builder.contactTypeId;
        this.contact = builder.contact;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getContactTypeId() {
        return contactTypeId;
    }

    public String getContact() {
        return contact;
    }

    public static class Builder{
        private String customerNumber, contactTypeId, contact;

        public Builder customerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder contactTypeId(String contactTypeId) {
            this.contactTypeId = contactTypeId;
            return this;
        }

        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        public Builder copy(CustomerContact customerContact) {
            this.contactTypeId = customerContact.contactTypeId;
            this.customerNumber = customerContact.customerNumber;
            this.contact = customerContact.contact;
            return this;
        }

        public CustomerContact build(){
            return new CustomerContact(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerContact that = (CustomerContact) o;
        return customerNumber.equals(that.customerNumber) && contactTypeId.equals(that.contactTypeId);
    }

    @Override
    public int hashCode() { return Objects.hash(customerNumber, contactTypeId, contact);

    }

    @Override
    public String toString() {
        return "CustomerContact{" +
                "customerNumber='" + customerNumber + '\'' +
                ", contactTypeId='" + contactTypeId + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
