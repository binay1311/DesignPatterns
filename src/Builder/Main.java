package Builder;

public class Main {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        CarBuilder carBuilder = new CarBuilder("5", "4");
        Car car = carBuilder
                    .setMusicSystem(true)
                    .setSunRoof(true)
                    .build();
    }
}
