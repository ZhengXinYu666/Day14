package cnm.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*   获取功能：获取下面这个字符串中由三个字符组成的单词
*   da jia ting wo shuo , jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
* */
public class RegexDemo9 {
    public static void main(String[] args) {
        //定义字符串
        String s = " da jia ting wo shuo , jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        //规则
        String regex = "\\b\\w{3}\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        //通过find方法查找有没有满足条件的子串
//        boolean flag = m.find();
//        System.out.println(flag);
//        //如何得到值呢？
//        String ss = m.group();
//        System.out.println(ss);

        //再来一次
        while (m.find()) {
            System.out.println(m.group());
//        }
            //注意！！！！！
            //一定先find 然后才能group

//        String ss = m.group();
//        System.out.println(ss);
        }
    }
}