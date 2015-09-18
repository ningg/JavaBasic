package top.ningg.java.basic;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by guoning on 15/9/8.
 */
public class LearnOfUUID {

    public static void main(String[] args) {

        // UUID
        // fb7d27a5-4403-4107-a5f2-2001630c6952, 128bit, 16字节, 32个16进制
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        System.out.println(uuid.toString().replaceAll("-", ""));

        // time
        Date today = DateTime.now().toDate();
        long currentTime = today.getTime();

//        long currentSecond = today.
//        System.out.println(currentTime);

        // day
        int durationOfDate = 24 * 60 * 60 * 1000;
        System.out.println(durationOfDate);

        // hour
        int durationOfHout = 60 * 60 * 1000;
        System.out.println(durationOfHout);

        // minute
        int durationOfMinute = 60 * 1000;
        System.out.println(durationOfMinute);



        System.out.println(Integer.MAX_VALUE);

    }


}
