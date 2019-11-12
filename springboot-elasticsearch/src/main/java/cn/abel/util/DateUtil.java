package cn.abel.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {


    public static String DateToStr(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(date);
        return str;
    }
}
