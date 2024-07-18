package org.example.javamockobjectives;

import java.time.LocalDateTime;
import java.time.Period;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1.minus(Period.ofDays(-1)));
    }
}

        /*Compilation error at line 1 as it's not the correct way to create the LocalDate object
        Compilation error at line 2 as ofDays() method accepts a positive integer always
        Today's date
        Previous day's date*/