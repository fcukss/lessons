package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();  // типы <ключ, значение>
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        System.out.println(map);
/*
        map.put(3, "другое значение для ключа три"); // значение ключа переписывается
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(10));  //если получаем значение которого нет то возвращется null
*/
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}
