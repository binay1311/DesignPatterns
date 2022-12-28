package AbstractFactory;

import AbstractFactory.Car.Car;
import AbstractFactory.Car.CarType;
import AbstractFactory.Location.DefaultCarFactory;
import AbstractFactory.Location.INDIACarFactory;
import AbstractFactory.Location.Location;
import AbstractFactory.Location.USACarFactory;

public class CarFactory {
    private CarFactory()
    {

    }
    public static Car buildCar(CarType type)
    {
        Car car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        switch(location)
        {
            case USA:
                car = USACarFactory.buildCar(type);
                break;

            case INDIA:
                car = INDIACarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);

        }

        return car;

    }
}
