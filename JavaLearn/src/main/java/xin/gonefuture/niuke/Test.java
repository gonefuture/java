package xin.gonefuture.niuke;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/5 16:45.
 *  说明：
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <pre> </pre>
 */
public  class Test {
        static AtomicInteger i = new AtomicInteger(10);

        int[]  arr = new int[] {1,2,3};
        static int a = 0;



        static byte b = (byte) 1295;

        // b = b + 1;

        public static void main(String[] args) {
//            a--;
//            i.compareAndSet(1,2);
//            System.out.println(b);


            Thread[] ths = new Thread[3];

            for (int i =0; i<3; i++) {
                ths[i] = new Thread(() -> {
                    for (int j=0; j<5; j++) {
                        System.out.print(j);
                    }
                    System.out.print(" ");
                });
            }

            for (Thread th : ths) {
                th.start();
            }

            String str = "1234";
            changeStr(str);
            System.out.println(str);




        }



    public static void changeStr(String str)
    {
        str = "welcome";
    }


}






