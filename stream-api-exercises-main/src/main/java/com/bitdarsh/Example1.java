package com.bitdarsh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example1 {

  public static void main(String[] args) throws ParseException {
    SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat outputFormat = new SimpleDateFormat("YYYYmmDD");

    String dateString = "20241231";
    Date date = inputFormat.parse(dateString);
    String reformattedDate = outputFormat.format(date);

    System.out.println(reformattedDate);
  }
}
