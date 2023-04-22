public class Toy extends Product{

    private int minAge;

    public Toy(String name, int price, int min_age) {
        super(name, price);
        this.minAge = min_age;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", minAge=" + minAge +
                '}';
    }
}
