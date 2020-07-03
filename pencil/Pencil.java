public class Pencil {
    String color;
    double length, price;

    public Pencil(String color, double length, double price) {
        this.color = color;
        this.length = length;
        this.price = price;
    }

    public static void main(String[] args) {
        Pencil pencil1 = new Pencil("Blue", 10, 200);
        Pencil pencil2 = new Pencil("Green", 11, 150);
        pencil1.display();
        pencil2.display();

    }

    public void display() {
        System.out.println("Color: " + color + " lenght: " + length + " price: " + price);
    }
}