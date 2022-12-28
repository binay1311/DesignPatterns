package Singleton;

//only one instance of singleton classes should be created
public class Eager {
    public static void main(String args[]){
//        Abc obj = new Abc(); // cant call since Abc() is private
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();
    }
}

class Abc{
    public static Abc obj = new Abc(); //Eager instantiation - Can take lot of memory if obj is memory heavy
    private Abc(){
        System.out.println("Instance created");
    }
    public static Abc getInstance(){
        return obj;
    }
}