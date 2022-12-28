package Builder;

public class Car {
    //required parameters
    public String seats;
    public String doors;

    //optional parameters
    public boolean isMusicSystem;
    public boolean isSunRoof;

    public String getSeats() {
        return seats;
    }

    public String getDoors() {
        return doors;
    }

    public boolean getMusicSystem() {
        return isMusicSystem;
    }

    public boolean getSunRoof() {
        return isSunRoof;
    }

    public Car(CarBuilder builder) {
        this.seats=builder.seats;
        this.doors=builder.doors;
        this.isMusicSystem=builder.isMusicSystem;
        this.isSunRoof=builder.isSunRoof;

        printSpecs();
    }

    public void printSpecs(){
        String carSpec = "Seats: " + seats + ", Doors: " + doors;
        if(isMusicSystem){
            carSpec = carSpec + ", MusicSystem: yes";
        }
        if(isSunRoof){
            carSpec = carSpec + ", SunRoof: yes";
        }
        System.out.println(carSpec);
    }
}
