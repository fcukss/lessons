package Lesson42Equls;

public class Test {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello123".substring(0, 5);  //отсекли цифрі 123
        System.out.println(b);
        System.out.println(a.equals(b)); // выдает  true
        System.out.println(a==b); // відает false



        Animal animal1 = new Animal(1);
        Animal animal2 = animal1;
        System.out.println( animal2.equals(animal1));
       // System.out.println(animal2);
    }
}
