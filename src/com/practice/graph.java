package com.practice;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class graph {
    public static void main(String[] args) {
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
        List<Txn> txns = new ArrayList<>();
        Txn txn = new Txn();
        Party party = new Party();
        party.retailer = null;
        Party party2 = new Party();
        party2.retailer = "null";

        txn.parites = Arrays.asList(party, party2);

        txns.add(txn);

        txns.stream().flatMap(t -> t.parites.stream().map(p -> p.retailer))
                //.filter(r -> r != null)
                .findFirst();


    }

    static class Txn{
        List<Party> parites;
    }

    static class Party {
        String retailer;
    }
    static BigDecimal m1(Double value){
        System.out.println("Double m");
        return null;//new BigDecimal(value);
    }

    static BigDecimal m1(double value){
        System.out.println("double m");
        return null;//new BigDecimal(value);
    }
}
