package lesson45Serelization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("people.bin"))) {


            Person person1 = (Person) ois.readObject();
            /*
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];
                for (int i = 0; i < personCount; i++){
                   people[i] = (Person) ois.readObject();
                }

             */
            System.out.println(Arrays.toString(new Person[]{person1}));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}