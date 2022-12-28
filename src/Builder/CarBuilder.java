package Builder;

public class CarBuilder {
    //required parameters
    public String seats;
    public String doors;

    //optional parameters
    public boolean isMusicSystem;
    public boolean isSunRoof;

    public CarBuilder(String seats, String doors){
        this.seats=seats;
        this.doors=doors;
    }

    public CarBuilder setMusicSystem(boolean isMusicSystem) {
        this.isMusicSystem = isMusicSystem;
        return this;
    }

    public CarBuilder setSunRoof(boolean isSunRoof) {
        this.isSunRoof = isSunRoof;
        return this;
    }

    public Car build(){
        return new Car(this);
    }
}
