package person;

public class Person {
    public String name;
    public int age;
    public double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out
                .print("Your name is " + name + ", Your age is " + age + " years old, Your height is " + height + " m");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Abdul", 45, 1.3);
        Person person2 = new Person("Usama", 36, 1.45);

        person1.display();
        person2.display();
    }

}