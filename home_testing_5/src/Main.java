public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Grandparent g = new Grandparent("Ba", 70);
        Parent p = new Parent("Pa", 30);
        Child c = new Child("Boy", 12);
        g.printAge();
        p.printAge();
        c.printAge();

        g.printWhoAreYou();
        p.printWhoAreYou();
        c.printWhoAreYou();

        c.laugh();
    }
}