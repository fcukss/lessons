package QueueAndStack;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(5);  //оранрчивает список до 5
        people.add(person4);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.remove()); //удалили первый елемент из очереди
        System.out.println(people.peek()); //посмотрели первый елемент из очереди

 //       for (Person person : people)
  //          System.out.println(person);



    }
}
class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}