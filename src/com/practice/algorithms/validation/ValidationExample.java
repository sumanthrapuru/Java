package com.practice.algorithms.validation;

public class ValidationExample {
//    private void validateRequest(LeadRequest req) {
//
//        Function<String, Supplier<String>> excMsgGenerator = str -> () -> str + " is either null or invalid";
//
//        validate(req.getRetailerId(), Objects::isNull, excMsgGenerator.apply("Retailer Id"));
//        validate(req.getPartner(), Objects::isNull, excMsgGenerator.apply("Partner name"));
//        validate(req.getRetailerName(),
//                name -> name.trim().isEmpty() || !name.matches("^[a-zA-Z ]+$"),
//                excMsgGenerator.apply("Retailer name"));
//        validate(req.getFirmName(),
//                name -> name.trim().isEmpty(), excMsgGenerator.apply("Firm name"));
//        validate(req.getPan(),
//                pan -> !pan.matches("^[a-zA-Z]{5}[\\d]{4}[a-zA-Z]$"),
//                excMsgGenerator.apply("PAN"));
//        validate(req.getDob(),
//                dob -> {
//                    LocalDate today = LocalDate.now();
//                    LocalDate dateOfBirth = new LocalDate(dob);
//                    return !(dateOfBirth.isAfter(today.minusYears(64)) && dateOfBirth.isBefore(today.minusYears(25)));
//                },
//                () -> "Date of Birth is null or invalid");
//        validate(req.getEmail(),
//                email -> !email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"),
//                excMsgGenerator.apply("Email"));
//        validate(req.getPhoneNumber(), phoneNo -> !phoneNo.matches("^\\d{10}$"), excMsgGenerator.apply("Phone no"));
//
//    }
}
