package cnm.test2;
/*
*   Date----String
*   String----Date
*
*   DateFormat可以进行日期和字符串的解析
*   由于是抽象类，所以使用具体子类SimpleDateFormat
*
* */
import java.text.*;
import java.util.*;
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        //创建格式化对象
//        SimpleDateFormat sdf = new SimpleDateFormat();
        //给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时MM分ss秒");
        //调用方法
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("---------------");

        String str = "2008-08-08 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);
    }
}
