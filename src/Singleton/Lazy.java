package Singleton;

//Not a singleton if using multi-threading
public class Lazy {
    public static void main(String args[]){
        Abcd obj1 = Abcd.getInstance();
        Abcd obj2 = Abcd.getInstance();
    }
}

class Abcd{
    public static Abcd obj;
    private Abcd(){
        System.out.println("Instance Created");
    }
    public static Abcd getInstance(){
        if(obj == null){
            obj = new Abcd();
        }
        return obj;
    }
}
