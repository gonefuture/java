package xin.gonefuture.niuke.someQuestion;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version : 2018/7/16 21:59.
 *  说明：
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre> </pre>
 */
public class Main {


    public static void main(String... args) {

        List<String>  list =  new ArrayList<String>() {{
            add("P1");
            add("P2");
            add("P3");
            add("C1");
            add("C3");
            add("C7");}
        };

        Iterator it = list.iterator();

        while (it.hasNext()) {
            if ("P1".equals(it.next())) {
                list.remove("C1");
                list.remove("C2");
            }

            if ("P2".equals(it.next())) {
                list.remove("C3");
                list.remove("C4");
            }

            if ("P3".equals(it.next())) {
                list.remove("C5");
            }
            if ("P4".equals(it.next())) {
                list.remove("C6");
                list.remove("C7");
            }
        }

        System.out.println(list);


    }




}

