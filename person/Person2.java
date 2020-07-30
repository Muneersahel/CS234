package person;

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
        Person person1 = new Person("Abdul", 45, 1.3);
        Person2 person2 = new Person2("Juma", 45, 1.5, "white");
        person1.display();   
        System.out.println("\n");
        person2.display();
    }
}