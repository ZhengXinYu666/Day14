package cnm.test;
import java.util.*;
/*
*   检验qq号码
*       1、要求必须是5-15位数字
*       2、0不能开头
*
*   分析：
*       a、键盘录入一个qq号码
*       b、写一个功能实现校验
*       c、调用功能，输出结果
*
*
* */
public class RegexDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号码");
        String qq = sc.nextLine();

        System.out.println("checkQQ"+checkQQ(qq));
    }

    //功能实现 返回值类型：boolean    参数列表:String qq
    public static boolean checkQQ(String qq){
        boolean flag = true;
        //校验长度
        if(qq.length()>=5 && qq.length()<=15){
            //0不能开头
            if(!qq.startsWith("0")){
                //必须是数字
                    char[] chs = qq.toCharArray();
                    for(int x = 0; x<chs.length; x++){
                        char ch = chs[x];

                        if(!Character.isDigit(ch)){
                            flag = false;
                            break;
                        }
                    }
            }
        }else{
            flag = false;
        }

        return flag;
    }
}
