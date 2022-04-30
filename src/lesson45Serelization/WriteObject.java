package lesson45Serelization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.AnnotatedArrayType;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person (1, "Bob"); //, new Person(2, "Tom"), new Person(3, "Bill")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(person1);


            /* вариант записи обектов масива по очереди
            oos.writeInt(people.length);

               for (Person person:people){
                    oos.writeObject(person);
                } */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

