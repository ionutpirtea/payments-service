package com.demo.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static LocalDate parseDate(String dateAsTExt) {
        return LocalDate.parse(dateAsTExt, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
