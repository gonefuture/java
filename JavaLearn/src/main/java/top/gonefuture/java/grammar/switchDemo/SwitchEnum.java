package top.gonefuture.java.grammar.switchDemo;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/19 20:50.
 *  说明：
 */

/**
 * <pre> </pre>
 */
public class SwitchEnum {
    Object o;
    String a;
    public static void main(String[] args) {
        Sex m = Enum.valueOf(Sex.class,"MALE");
        System.out.println();
        Sex sex = Sex.MALE;
        switch (sex) {
            case MALE: {
                System.out.println(sex.ordinal());
            }

        }
    }
}

enum Sex {

    MALE, FMALE;
}
