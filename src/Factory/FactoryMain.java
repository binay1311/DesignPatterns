package Factory;

import Factory.os.Android;
import Factory.os.OS;
import Factory.os.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String args[]){
//        OS obj = new Android();
//        obj.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("closed");
        obj.spec();
    }
}
