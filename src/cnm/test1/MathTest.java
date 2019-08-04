package cnm.test1;

import java.util.Scanner;

/*
*   需求：设计方法，实现获取任意范围内的随机数
*
*   分析：
*       1、键盘录入两个数据
*           int start;
*           int end;
*       2、想办法获取在start到end之间的随机数
*       3、输出这个随机数
* */
public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数");
        int start = sc.nextInt();
        System.out.println("请输入结束数");
        int end = sc.nextInt();

        int num = getRandom(start,end);
        System.out.println(num);
    }
    //功能实现效果    返回值：int 参数列表 int start int end
    public static int getRandom(int start,int end){
        int number = (int)(Math.random()*(end-start+1)+start);
        return number;
    }
}