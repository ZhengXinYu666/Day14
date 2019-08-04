package cnm;

import java.util.Calendar;
import java.util.Scanner;

/*
*   如何获取任意年份的二月份有多少天
*
*   分析：
*       1、键盘录入年份
*       2、设置日历对象的年月日
*           年就是1输入的数据
*           月是2
*           日是1
*       3、把时间往前推一天就是2月的最后一天
*       4、输出日期即可
*
* */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);

        System.out.println(c.get(Calendar.DATE));
    }
}
