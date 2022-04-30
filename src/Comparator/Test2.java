package Comparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<PersonTwo> peopleList = new ArrayList<>();
        Set<PersonTwo> peopleSet = new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    public static void addElements(Collection collection) {

        collection.add(new PersonTwo(2, "To"));
        collection.add(new PersonTwo(4, "George"));
        collection.add(new PersonTwo(3, "Mike"));
        collection.add(new PersonTwo(1, "Bob"));
    }
}

class PersonTwo implements Comparable<PersonTwo> {
    private int id;
    private String name;

    public PersonTwo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTwo personTwo = (PersonTwo) o;
        return id == personTwo.id && Objects.equals(name, personTwo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(PersonTwo o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
