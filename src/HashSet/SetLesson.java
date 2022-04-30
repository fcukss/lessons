package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("MIke");
        hashSet.add("Bob");
        hashSet.add("Tom");
        hashSet.add("Bob");
        hashSet.add("Kate");
        hashSet.add("Anna");


      //  for(String name : hashSet){
       //     System.out.println(name);
      //  }
      //  System.out.println(hashSet.contains("Bob"));




    }
}
