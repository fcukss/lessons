package Lesson42Equls;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnaimal = (Animal)  obj;
        return this.id ==  otherAnaimal.id;
    }
}
