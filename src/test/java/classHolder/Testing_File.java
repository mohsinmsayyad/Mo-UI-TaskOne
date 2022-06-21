package classHolder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testing_File {

    public static void main(String[] args)
    {


        LocalDateTime instance = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyhhmm");

        String DateTimeStamp = formatter.format(instance);

        System.out.println( DateTimeStamp);

    }
}
