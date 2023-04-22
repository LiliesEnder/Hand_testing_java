import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Shop {
    private Product[] products;
    private int capacity;
    private int len;

    public Shop(int capacity) {
        this.products = new Product[capacity];
        this.capacity = capacity;
        this.len = 0;
    }

    public void addProduct(Product product) throws ShopExceptions {
        if(this.len >= this.products.length){
            throw new ShopExceptions("Full shop capacity");
        }
        this.products[this.len] = product;
        this.len++;
    }

    public void deleteProduct(String name) throws ShopExceptions {
        int pos = -1;
        for (int i = 0; i < this.len; i++) {
            if(this.products[i].getName().equals(name)){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            throw new ShopExceptions("Not found product");
        }
        for (int i = pos; i < this.len - 1; i++) {
            this.products[i] = this.products[i + 1];
        }
        this.len--;
    }

    public int size(){
        return this.len;
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

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + Arrays.toString(products) +
                ", capacity=" + capacity +
                ", len=" + len +
                '}';
    }
}
