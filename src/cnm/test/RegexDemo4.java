package cnm.test;
/*
*   需求：校验邮箱
*       1、键盘录入
*       2、定义邮箱规则
*           593319340@qq.com
*           zhengxinyu1414@163.com
*           giaogiao@sina.com.cn
*           fqy@itcast.cn
*       3、调用功能判断
*       4、输出结果
*
* */
import java.util.*;

public class RegexDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的邮箱地址：");
        String address = sc.nextLine();
        System.out.println(checkAddress(address));
    }
    public static boolean checkAddress(String address){
        //String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
        boolean flag = address.matches(regex);
        return flag;
    }
}
