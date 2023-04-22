public class Child extends Parent{

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void printWhoAreYou() {
        System.out.println("I am Child, " + this.name);
    }

    public void laugh(){
        System.out.println("ha-ha-ha!");
    }
}
