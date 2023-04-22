public class Product {
    private String name;
    private int price;
    public Product(String name, int price){
        this.name = name.toLowerCase();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
