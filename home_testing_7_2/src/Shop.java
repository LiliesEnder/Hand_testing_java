import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class Shop {
    private LinkedList<Product> products;

    public Shop() {
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(String name) throws ShopExceptions {
        int pos = -1;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName().equals(name)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            throw new ShopExceptions("Not found product", new Object());
        }
        this.products.remove(pos);
    }

    public int size() {
        return this.products.size();
    }

    public Product[] getProducts(int cost) {
        int new_size = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getPrice() <= cost) {
                new_size++;
            }
        }
        int pos = 0;
        Product[] chiper = new Product[new_size];
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getPrice() <= cost) {
                chiper[pos] = this.products.get(i);
                pos++;
            }
        }
        return chiper;
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName().contains(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Product findTheCheapest() {
        Product chipest = this.products.get(0);
        for (int i = 1; i < this.products.size(); i++) {
            if (this.products.get(i).getPrice() < chipest.getPrice()) {
                chipest = this.products.get(i);
            }
        }
        return chipest;
    }

    public Phone[] findPhones(String maker) {
        int new_size = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Phone) {
                if (((Phone) this.products.get(i)).getManufacturer().contains(maker.toLowerCase())) {
                    new_size++;
                }
            }
        }
        Phone[] phones = new Phone[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Phone) {
                if (((Phone) this.products.get(i)).getManufacturer().contains(maker.toLowerCase())) {
                    phones[pos] = (Phone) this.products.get(i);
                    pos++;
                }
            }
        }
        return phones;
    }

    public <T> Toy[] findToys(T age) {
        int age_f = Integer.parseInt(age.toString());
        int new_size = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Toy) {
                if (((Toy) this.products.get(i)).getMinAge() <= age_f) {
                    new_size++;
                }
            }
        }
        Toy[] toys = new Toy[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Toy) {
                if (((Toy) this.products.get(i)).getMinAge() <= age_f) {
                    toys[pos] = (Toy) this.products.get(i);
                    pos++;
                }
            }
        }
        return toys;
    }

    public <T> Food[] findFood(T date) throws ShopExceptions {
        Date date_f = new Date();
        try {
            date_f = DateFormat.getDateInstance().parse(date.toString());
        } catch (ParseException e) {
            throw new ShopExceptions("Can`t parse date", e);
        }
        int new_size = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Food) {
                if (((Food) this.products.get(i)).getExpiration().after(date_f)) {
                    new_size++;
                }
            }
        }
        Food[] foods = new Food[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i) instanceof Food) {
                if (((Food) this.products.get(i)).getExpiration().after(date_f)) {
                    foods[pos] = (Food) this.products.get(i);
                    pos++;
                }
            }
        }
        return foods;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + this.products.toString() +
                '}';
    }
}
