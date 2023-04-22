import java.util.Date;

public class Food extends Product{

    private Date expiration;

    public Food(String name, int price, Date expiration) {
        super(name, price);
        this.expiration = expiration;
    }

    public Date getExpiration() {
        return expiration;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", expiration=" + expiration +
                '}';
    }
}
