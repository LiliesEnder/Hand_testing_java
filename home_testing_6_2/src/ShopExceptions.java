public class ShopExceptions extends Exception{
    private String message;
    public ShopExceptions(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
