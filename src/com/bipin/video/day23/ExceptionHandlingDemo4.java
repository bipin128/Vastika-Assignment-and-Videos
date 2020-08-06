package com.bipin.video.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionHandlingDemo4 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        parseDateToString(date);

        String d = "1995-05-06";
        System.out.println(d);
        try {
            parseStringToDate(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseDateToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm a MM/dd/yyyy");
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);
    }

    public static void parseStringToDate(String d) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(d);
        System.out.println(date);
    }
}
