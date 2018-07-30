package top.gonefuture.java.grammar.innerClassDemo;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/21 20:42.
 *  说明：
 */

/**
 * <pre> </pre>
 */
public class InnerClassTest {
    int a =0;


    public static void main(String[] args) {
        InnerClassTest innerClassTest = new InnerClassTest();
        InnerClassTest.Inner  inner = innerClassTest.new Inner();

    }

    class Inner {
        int a =0;
        Inner() {
            a =3;
        }

        int getA() {
            return a;
        }

        void m() {
            class Local {

            }
        }

    }
}
