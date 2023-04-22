import java.util.Calendar;
import java.util.Date;

public class Shop {
    private Product[] products;

    public Shop() {
        this.products = new Product[]{
                new Product("p1", 1),
                new Food("f1", 2, new Date(2023, Calendar.APRIL, 24)),
                new Toy("t1", 3, 5),
                new Phone("p2", 4, "melon"),
                new Product("p3", 5),
                new Product("p1", 6),
                new Product("p1", 7),
        };
    }

    public Product[] getProducts(int cost) {
        int new_size = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getPrice() <= cost) {
                new_size++;
            }
        }
        int pos = 0;
        Product[] chiper = new Product[new_size];
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getPrice() <= cost) {
                chiper[pos] = this.products[i];
                pos++;
            }
        }
        return chiper;
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getName().contains(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Product findTheCheapest() {
        Product chipest = this.products[0];
        for (int i = 1; i < this.products.length; i++) {
            if (this.products[i].getPrice() < chipest.getPrice()) {
                chipest = this.products[i];
            }
        }
        return chipest;
    }

    public Phone[] findPhones(String maker) {
        int new_size = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Phone) {
                if (((Phone) this.products[i]).getManufacturer().contains(maker.toLowerCase())) {
                    new_size++;
                }
            }
        }
        Phone[] phones = new Phone[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Phone) {
                if (((Phone) this.products[i]).getManufacturer().contains(maker.toLowerCase())) {
                    phones[pos] = (Phone) this.products[i];
                    pos++;
                }
            }
        }
        return phones;
    }

    public Toy[] findToys(int age) {
        int new_size = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Toy) {
                if (((Toy) this.products[i]).getMinAge() <= age) {
                    new_size++;
                }
            }
        }
        Toy[] toys = new Toy[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Toy) {
                if (((Toy) this.products[i]).getMinAge() <= age) {
                    toys[pos] = (Toy) this.products[i];
                    pos++;
                }
            }
        }
        return toys;
    }

    public Food[] findFood(Date date) {
        int new_size = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Food) {
                if (((Food) this.products[i]).getExpiration().after(date)) {
                    new_size++;
                }
            }
        }
        Food[] foods = new Food[new_size];
        int pos = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Food) {
                if (((Food) this.products[i]).getExpiration().after(date)) {
                    foods[pos] = (Food) this.products[i];
                    pos++;
                }
            }
        }
        return foods;
    }
}
