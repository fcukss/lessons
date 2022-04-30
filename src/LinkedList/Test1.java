package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer>  arrayList = new ArrayList<>();
            measureTime(linkedList);

            measureTime(arrayList);
    }

    public static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();
        for( int i= 0; i < 100000; i++ ){
         ///   list.add(i); // добавляет в конец листа новый символ

            list.add(0,i); // обавляет элемент в начало листа
        }


        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
