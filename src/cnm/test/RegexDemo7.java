package cnm.test;
/*
*   替换功能
*   public String replaceAll(String regex,String replacement)
*
* */
public class RegexDemo7 {
    public static void main(String[] args) {
        //定义字符串
        String s = "hello12345world622112345677java";

        //我要去除所有的数字，用*替换掉
//        String regex = "\\d";
//        String ss = "*";
        //把数字干掉

        String regex = "\\d+";
        String ss = "";

        String result = s.replaceAll(regex,ss);
        System.out.println(result);
    }
}
