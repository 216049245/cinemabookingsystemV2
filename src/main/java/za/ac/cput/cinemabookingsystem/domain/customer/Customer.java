package za.ac.cput.cinemabookingsystem.domain.customer;

import java.util.Objects;

public class Customer {

    private final String customerNumber, firstName, middleName, lastName;
    private Customer(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getCustomerNumber() { return customerNumber;}

    public String getFirstName() { return firstName;}

    public String getMiddleName() { return middleName;}

    public String getLastName() { return lastName;}

    public static class Builder {
        private String customerNumber, firstName, middleName, lastName;

        public Builder customerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Customer customer) {
            this.customerNumber = customer.customerNumber;
            this.firstName = customer.firstName;
            this.middleName = customer.middleName;
            this.lastName = customer.lastName;
            return  this;
        }

        public Customer build() { return new Customer(this);}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass())return false;
            Customer customer = (Customer) o;
            return customerNumber.equals(customer.customerNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(customerNumber);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "customerNumber='" + customerNumber + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}

