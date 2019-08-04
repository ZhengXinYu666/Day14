package cnm.test;
import java.util.*;
/*
*   需求：判断手机号码是否符合规则
*
*   分析：
*       1、键盘录入
*       2、定义手机号码规则
*       3、判断
*       4、输出
* */
public class RegexDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的手机号码");
        String number = sc.nextLine();
        System.out.println(checkNumber(number));

    }
    public static boolean checkNumber(String number){
        String regex = "1[3-8]\\d{9}";
        boolean flag = number.matches(regex);
        return flag;
    }
}
