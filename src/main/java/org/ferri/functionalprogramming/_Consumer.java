package org.ferri.functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer ferri = new Customer("ferri","999");
        greetCustomer(ferri);
        Customer fendi = new Customer("fendi","888");
        greetCustomerConsumer.accept(fendi);
        greetCustomerConsumerV2.accept(fendi,false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName
                    + " Thanks for registering number "
                    + customer.customerPhoneNumber);
    }

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + " Thanks for registering number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "****" ));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + " Thanks for registering number "
                    + customer.customerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }

}
