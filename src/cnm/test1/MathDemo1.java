package cnm.test1;

import java.util.Random;

/*
*   Random产生随机数的类
* 构造方法：
*   public Random():没有给种子，用的默认种子，是当前时间的毫秒值
*   public Random(long seed):给除了固定的种子
*
* 成员方法都是获取int类型
*   public int nextInt()：返回的是int范围内的随机数
*   public int nextInt(int n)：返回的是[0,n)范围内的随机数
* */
public class MathDemo1 {
    public static void main(String[] args) {
//        Random r = new Random();
          Random r = new Random(1111);

        for(int x = 0; x<10;x++){
            int num = r.nextInt(100)+1;
            System.out.println(num);
        }
    }
}
