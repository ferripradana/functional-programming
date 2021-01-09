package org.ferri.functionalprogramming;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println(
                "Is phone Number valid and contains 3 " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07009877300")
        );
        System.out.println(
                "Is phone Number valid and contains 3 " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
        );

    }

    static Boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = s ->
            s.startsWith("07") && s.length() == 11;

    static Predicate<String> containsNumber3 = s ->
            s.contains("3");



}
