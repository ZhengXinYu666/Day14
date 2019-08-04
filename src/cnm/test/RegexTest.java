package cnm.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
*   有一个如下字符串 "91 27 46 38 50"
*   实现最终结果："27 38 46 50 91"
*
*
*   分析：
*       1、定义一个字符串
*       2、把字符串分割，得到一个字符串数组
*       3、将字符串转变换成int数组
*       4、对int数组排序
*       5、排序后的int数组再组装成一个字符串
*       6、输出字符串
* */
public class RegexTest {
    public static void main(String[] args) {
        //定义字符串
        String s = "91 27 46 38 50";
        //字符串分割，得到字符串数组
        String[] strArray = s.split(" ");
        //将字符串数组变为int数组
        int[] arr = new int[strArray.length];

        for(int x = 0; x < arr.length; x++){
            arr[x] = Integer.parseInt(strArray[x]);
        }

        //对int数组进行排序
        Arrays.sort(arr);

        //把排序后的int数组拼接成一个字符串
        StringBuilder sb = new StringBuilder();
        for(int x= 0; x <arr.length; x++){
            sb.append(arr[x]).append(" ");
        }
        //转换为字符串
        String result = sb.toString();

        //输出字符串
        System.out.println("result:"+ result);
    }
}
