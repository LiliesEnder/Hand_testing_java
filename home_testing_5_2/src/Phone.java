public class Phone extends Product{

    private String manufacturer;

    public Phone(String name, int price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
