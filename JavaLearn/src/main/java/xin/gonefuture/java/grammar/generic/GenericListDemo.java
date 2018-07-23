package xin.gonefuture.java.grammar.generic;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

public class GenericListDemo {


    public static void main(String ... args) {
         List<?> list = new ArrayList<>();
         Integer i =Integer.valueOf(5);
         list.add(null);
        list.add(null);

         for (Object o: list) {
             System.out.println(o);
         }
        add(list);


    }



    static List<?> add(List<?> list) {

        for (Object o: list) {
            System.out.println(o);
        }
        return list;
    }
}
