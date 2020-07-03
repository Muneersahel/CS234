package person

public class Person2 extends Person {
    String color;

    public Person2(String name, int age, double height, String color) {
        super(name, age, height);
        this.color = color;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", Your color is " + color);
    }

    public static void main(String[] args) {
        Person2 person3 = new Person2("Juma", 45, 1.5, "white");
        person3.display();
    }
}