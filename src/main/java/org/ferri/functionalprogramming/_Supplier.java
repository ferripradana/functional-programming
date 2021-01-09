package org.ferri.functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        List<String> suppliers = getDbConnectionSupplier.get();
        suppliers.forEach(System.out::println);
    }

    static Supplier<List<String>> getDbConnectionSupplier = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer"
            );

}
