public class Product {
    double price;
    int quantity;
    String name;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }


}
