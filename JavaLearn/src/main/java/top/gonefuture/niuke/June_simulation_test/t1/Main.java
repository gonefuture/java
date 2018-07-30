package top.gonefuture.niuke.June_simulation_test.t1;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/25 15:43.
 *  说明：
 */

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <pre> 牛牛与妞妞闲来无聊，便拿出扑克牌来进行游戏。游戏的规则很简单，两个人随机抽取四张牌，四张牌的数字和最大的取胜（该扑克牌总张数为52张，没有大小王，A=1，J=11，Q=12，K=13，每种数字有四张牌），现在两人已经分别亮出了自己的前三张牌，牛牛想要知道自己要赢得游戏的概率有多大。
 * 输入描述:
 * 输入包含两行，第一行输入三个整数a1，b1，c1(1≤a1，b1，c1≤13)，表示牛牛亮出的扑克牌。第二行输入三个整数a2，b2，c2(1≤a2，b2，c2≤13)，表示妞妞所亮出的扑克牌。
 *
 *
 * 输出描述:
 * 输出一个数字x（保留4位小数），表示牛牛获胜的概率。
 *
 * 输入例子1:
 * 3 5 7
 * 2 6 8
 *
 * 输出例子1:
 * 0.3995
 * </pre>
 */
public class Main {
    static int win = 0;
    static int all = 0;
    private static Map<Integer,Integer> pai = new HashMap<>();


    static {
        for (int i=1; i<=13;i++) {
            pai.put(i,4);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] six = new int[6];
        for (int i=0;i<6; i++) {
           six[i] = sc.nextInt();
        }

        // 去掉已经展示的牌
        for (Integer i : pai.keySet()) {
            for (Integer ii: six) {
                if ( i.equals(ii)) {
                    pai.put(i,pai.get(i)-1);
                }
            }
        }


        for (int a=1; a<=13;a++) {
            for (int b=1; b<=13;b++) {
                if (check(a,b)) {
                    all++;
                    if (six[0]+six[1]+six[2]+a > six[3]+six[4]+six[5]+b) {
                        win++;
                    }
                }
            }
        }

        //System.out.println(pai);
        //System.out.println(win);
        //System.out.println(all);
        System.out.printf("%.4f",win*1.0/all);

    }


    static boolean check(int a, int b ) {
        Map<Integer, Integer> map = new HashMap<>(pai);
        if (map.get(a) >0 && getPai(map,a) &&
        map.get(b) >0  ) {
            //System.out.println(map);
            return true;
        }

        return false;
    }



    static boolean getPai(Map<Integer,Integer> map, int x) {
        map.put(x,map.get(x)-1);
        return true;
    }
}
