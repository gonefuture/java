package top.gonefuture.niuke._2018xiaozhao._4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/9 18:57
 * @version 1.00
 * Description: JavaLearn
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[][] phones = new String[t][];
        Map[] maps = new Map[t];
        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            Map<String, String> map = new HashMap<>();
            for (int j=0;j<n; j++) {
                map.put(sc.next(), sc.next());
            }
            maps[i] = map;

            int m = sc.nextInt();
            String[] lines = new String[m];
            for (int k=0; k<m; k++) {
                lines[k] = sc.next();
            }
            phones[i] = lines;

        }


        for (int i=0; i<t; i++) {
            for (String phone: phones[i]) {
                if (maps[i].containsKey(phone)) {
                    System.out.println(maps[i].get(phone));
                } else {
                    System.out.println("unknown");
                }
            }
        }
    }




    private static boolean check(Map map, String phone) {
        Pattern p = Pattern.compile("[^0-9]");
        String start = p.matcher(phone).replaceAll("").trim();
        return map.containsKey(start);
    }
}
