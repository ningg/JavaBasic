package top.ningg.java.basic;


import org.joda.time.LocalDate;

import java.util.Date;

public class TestOfLocalDate {

    public static void main(String[] args) {
        Date curDate = new Date();
        LocalDate today = new LocalDate(curDate);
        System.out.println(today);
    }
}
