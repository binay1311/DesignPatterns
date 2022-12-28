package Singleton;

public class IntroducingThreads {
    public static void main(String args[]){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abcde obj1 = Abcde.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abcde obj2 = Abcde.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class Abcde{
    public static Abcde obj;
    private Abcde(){
        System.out.println("Instance Created");
    }
    //Singleton Pattern violated
    public static Abcde getInstance(){
        if(obj == null){
            obj = new Abcde();
        }
        return obj;
    }

//    public static Abcde getInstance(){  //Double checked locking
//        if(obj == null){
//            synchronized (Abcde.class){
//                if(obj == null){
//                    obj = new Abcde();
//                }
//            }
//        }
//        return obj;
//    }

}