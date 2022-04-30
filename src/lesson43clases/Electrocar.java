package lesson43clases;

public class Electrocar {
    private int id;

    //влоденній нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor" + id + " is starting....");
        }
    }

    //вложенній статический класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int x= 1 ; // должны быть только констнатны
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar" + id + " is starting....");
    }


}
