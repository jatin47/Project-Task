package sep092022;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;


public class Task2 {

    public static void main(String[] args) throws ParseException {
        // Q-Number formate for the give number amount is : i/p 100000 o/p : 1,00,000

        long num = 1000000000000000L;
        // Method-1
        String numFormat = NumberFormat.getInstance().format(num);
        System.out.println(numFormat);

        // //Method-2
        String numFor = new DecimalFormat("#,###,###").format(num);
        System.out.println(numFor);

        // Q- Convert one data formate to another data formate data is 09-09-2022 ,
        // it should convert into 09-SEP-2022

        String date = "09-09-2022";
        TemporalAccessor temporal = DateTimeFormatter
                                    .ofPattern("dd-MM-Y")
                                    .parse(date); // use parse(date, LocalDateTime::from) to get LocalDateTime
        String output = DateTimeFormatter
                        .ofPattern("dd-MMM-Y")
                        .format(temporal)
                        .toUpperCase();
                        
        System.out.println(output);
    }

}
