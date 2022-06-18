package date;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

//        Date date = new Date();
//        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
//        System.out.println(df.format(date));

        java.util.Date utilDate = new java.util.Date();
//        Date sqlDate = new Date(utilDate.getTime());
        Timestamp sqlTS = new Timestamp(utilDate.getTime());

//        Date sqlDate = new Date(System.currentTimeMillis());
//        Time sqlTime = new Time(System.currentTimeMillis());

        System.out.println("util " + utilDate);
        System.out.println("sql " + sqlTS);
    }
}
