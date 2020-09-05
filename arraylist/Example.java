package arraylist;
import java.util.ArrayList;


public class Example {
    public static void main(String[] args) {
        System.out.println("Creating new StorageRoom object");
        Storage sr = new StorageRoom();
        System.out.println("Object created!");
        if (sr instanceof Storage) {
            System.out.println("Interface used correctly!");
        } else {
            System.out.println("Interface not implemented.");
        }
        System.out.println("Adding products...");
        addProduct("Pants","Leather",sr);
        addProduct("Table","Wood",sr);
        addProduct("Bottle","Glass",sr);
        addProduct("Cookies","Pastry",sr);
        System.out.println("Total number of products: " + sr.numberOfProducts());
        System.out.println("Products in order:");
        for (int i=0; i < sr.numberOfProducts(); i++) {
            System.out.println(sr.getProduct(i));
        }
        System.out.println("Finding product with name Table...");
        System.out.println(sr.getProduct("Table"));
        System.out.println("Finding non-existing product with name Bed...");
        System.out.println(sr.getProduct("Bed"));
        
    }
    public static void addProduct(String name, String material, Storage sr) {
        System.out.println("Adding " + name + ", material: " + material);
        sr.addProduct(new Product(name, material));
        System.out.println("Added!");
    }
}

class StorageRoom implements Storage{
  ArrayList<Product> products = new ArrayList<Product>();
  public void addProduct(Product product){
      products.add(product);
  }
  public Product getProduct(int index){
      return products.get(index);
  }
  public int numberOfProducts(){
      return products.size();
  }
  @Override
  public Product getProduct(String name) {
    for (Product product : products) {
      if (product.getName().equals(name)) {
        return product;
      }
    }
    return null;
  }
} 

interface Storage {
  void addProduct(Product product);
  Product getProduct(int index);
  Product getProduct(String name);
  int numberOfProducts();
}

class Product {
  private final String name;
  private final String material;

  public Product(String name, String material) {
      this.name = name;
      this.material = material;
  }

  public String getName() {
      return name;
  }

  public String getMaterial() {
      return material;
  }
  
  @Override
  public String toString(){
      return name + " (" + material + ")";
  }
}
