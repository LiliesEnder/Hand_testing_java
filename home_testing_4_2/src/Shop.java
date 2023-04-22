public class Shop {
    private Product[] products;
    public Shop(){
        this.products = new Product[]{
                new Product("p1", 1),
                new Product("p2", 2),
                new Product("p1", 3),
                new Product("p2", 4),
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

    public boolean containsProduct(String name){
        for (int i = 0; i < this.products.length; i++) {
            if(this.products[i].getName().contains(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public Product findTheCheapest(){
        Product chipest = this.products[0];
        for (int i = 1; i < this.products.length; i++) {
            if(this.products[i].getPrice() < chipest.getPrice()){
                chipest = this.products[i];
            }
        }
        return chipest;
    }
}
