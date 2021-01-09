package org.ferri.combinator;

import java.time.LocalDate;
import static org.ferri.combinator.CustomerRegistrationValidator.*;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(1992,1,1)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }


    }
}
