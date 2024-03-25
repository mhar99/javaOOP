import childs.Item;
import parents.Product;
import parents.Shape;
import childs.Circle;
import childs.Triangle;

public class MainApp {
    public static void main(String[] args){
    // Product product1 = new Product(); //tidak dapat langsung diinstansiasi menjadi object karena Class Product adalah abstrak
    // Product product2 = new Item(); //dapat membuat object produk dari instasiasi Child class Item

    Shape lingkaran = new Circle("Biru",20);
    Shape segitiga = new Triangle(10, 15, "Merah");

    System.out.println("Luas lingkaran berwarna "+lingkaran.getColor()+" adalah "+lingkaran.getArea());
    System.out.println("Luas Segi Tiga berwarna "+segitiga.getColor()+" adalah "+segitiga.getArea());
    }
}
