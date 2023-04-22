public class ShopExceptions extends Exception{
    private String message;
    private Object original;
    public ShopExceptions(String message, Object original){
        super(message);
        this.message = message;
        this.original = original;
    }
    public String getMessage(){
        return this.message;
    }

    public Object getOriginal(){
        return this.original;
    }
}
