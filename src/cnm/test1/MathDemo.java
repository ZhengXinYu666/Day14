package cnm.test1;
/*
*   用于数学运算的类
* */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println("---------");

        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println("---------");

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");

        System.out.println(Math.max(12,23));
        //获取三个中的最大值
        //方法的嵌套调用
        System.out.println(Math.max(Math.max(12,23),18));
        //获取四个数据中的最大值
        System.out.println(Math.max(Math.max(12,78),Math.max(34,56)));
        System.out.println("--------");

        System.out.println(Math.pow(2,3));
        System.out.println("--------");

        //随机数[0.0 , 1.0)
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100)+1);
        System.out.println("--------");

        System.out.println(Math.round(12.34f));
        System.out.println(Math.round(12.56f));
        System.out.println("--------");

        System.out.println(Math.sqrt(4));
    }
}
