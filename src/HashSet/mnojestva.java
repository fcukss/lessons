package HashSet;

import java.util.HashSet;
import java.util.Set;

public class mnojestva {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(0);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        // union - объедененеи множеств
        Set<Integer> union = new HashSet<>(set1);
       union.addAll(set2);
        System.out.println(union);

        // intersection - пересечение множеств

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
