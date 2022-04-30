package LinkedHachMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // не гарантируется порядок
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        // гаранитуертся порядок добавления ключ значение. в каком порядке добавлені парі ключ
        // значения в таком порядке они и вернутся
        Map<Integer, String> treeMap = new TreeMap<>(); // порядок по ключу

    testMap(treeMap);

    }
    public static void testMap (Map<Integer, String> map){
        map.put(39, "Bob");
       map.put(40,"Mike");
       map.put(18, "Tom");
        map.put(28, "Anna");
        map.put(100, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
