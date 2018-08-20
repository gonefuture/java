package top.gonefuture.niuke.wangyi_java._0807;

/**
 * @author gonefuture  gonefuture@qq.com
 * @version 1.00
 * Description: JavaLearn
 * @time 2018/8/7 11:53
 */
import java.util.*;

public class Main {
public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        String turns = sc.next();
        int now = 0;
        for(char c : turns.toCharArray()) {
        if (c == 'L')
            now -=1;
        else
            now += 1;
        }

        switch(now%4) {
        case 0 : System.out.println("N"); break;
        case 1 : System.out.println("E"); break;
        case 2 : System.out.println("S"); break;
        case 3 : System.out.println("W"); break;
        case -1 : System.out.println("W"); break;
        case -2 : System.out.println("S"); break;
        case -3 : System.out.println("E"); break;
        }


        }
        }