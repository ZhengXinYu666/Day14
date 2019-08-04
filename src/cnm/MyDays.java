package cnm;
/*
*   算一下你来到这个世界多少天？
*
*   分析：
*       a、键盘录入你的出生年月日
*       b、把该字符串转换为一个日期
*       c、通过该日期得到一个毫秒值
*       d、获取当前时间的毫秒值
*       e、d-c获得一个毫秒值
*       f、把毫秒值转换为年
*           /1000/60/60/24
* */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class MyDays {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日：");
        String line = sc.nextLine();

        //转换为一个日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);
        //通过该日期得到一个毫秒值
        long myTime = d.getTime();
        //获取当前时间的毫秒值
        long nowTime = System.currentTimeMillis();
        //毫秒值相减
        long time = nowTime-myTime;

        //转换为年
        long day = time/1000/60/60/24;
        System.out.println("你来到这个世界已经"+day+"天了");
    }
}
