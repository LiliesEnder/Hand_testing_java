public class Grandparent{
    String name;
    int age;
    public Grandparent(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void printAge(){
        System.out.println("I am "+this.age+" years old");
    }
    public void printWhoAreYou(){
        System.out.println("I am Grandparent, " + this.name);
    }
}
