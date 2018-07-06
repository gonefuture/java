package xin.gonefuture.niuke.pat.digitalClassification;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/21 16:29.
 *  说明：
 */

import java.util.ArrayList;
import java.util.List;

/**
 * <pre> </pre>
 */
public class Main {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((Main)null).testMethod(); // 强转Null 是可以的
    }
}


class A {

    List m() {
        return null;
    }

    class B{
        int a;
        B(A a){

        }


    }
}

class D extends A {
    @Override
    ArrayList m() {
        return null;
    }
}