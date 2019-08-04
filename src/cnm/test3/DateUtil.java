package cnm.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
*   这是日期和字符串相互转换的工具类
*
*   @author  郑黑脸
*
* */
public class DateUtil {
    /*
    *   这个方法的作用就是把日期转成一个字符串
    *   @param d
    *           被转换的日期对象
    *   @param format
    *           传递过来的要被转换的格式
    *   @return 格式化后的字符串
    * */
    public static String dateToString(Date d,String format){
        return new SimpleDateFormat(format).format(d);
    }
    /*
    *   这个方法的作用就是把一个字符串解析成一个日期对象
    *   @param s    被解析的字符串
    *   @param format   传递过来的要被转换的格式
    *   @return     解析后的日期对象
    *   @throws ParaseException 抛出异常
    * */
    public static Date stringToDate(String s, String format)
        throws ParseException{
        return new SimpleDateFormat(format).parse(s);
    }
}
