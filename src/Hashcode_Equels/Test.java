package Hashcode_Equels;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();




    Person person1 = new Person(1, "Bob");
    Person person2 = new Person(1,"Bob");

    map.put(person1, "1234");
    map.put(person2, "324");

    set.add(person1);
    set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}


class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
