package top.gonefuture.offer._4;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/29 14:47
 * @version 1.00
 * Description: 替换字符串中的空格
 *
 */
public class Main {

    public static void main(String[] args) {
        String url = "http://fanyi.baidu.com/#en/zh/sword fingers offer  ";
        System.out.println(replaceBlank(url));
    }

    private static String  replaceBlank(String s) {
       String replaced = s.replaceAll(" ", "%20");

       return replaced;
    }

}
