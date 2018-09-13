package top.gonefuture.offer._28;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/6 18:18
 * @version 1.00
 * Description: 字符串的排列
 */
public class  Main {

    public static void main(String[] args) {

    }

    private static void permutation(String s, int index) {
        if (s.length() == index)
            return;
        char c = s.charAt(index);
        System.out.print(c);
        for (int i=1; i<s.length();i++) {

        }
    }
}
