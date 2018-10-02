/**
 * Kai'lani Woodard
 * CH3PC2 - Car 
 * Programming II - AP CS
 * 10-3-2018
 */

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    //Constructor for Car
    public Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }
    
    //Mutator method for setting the year
    public void setYearModel(int y) {
        yearModel = y;
    }
    
    //Mutator method for setting the make
    public void setMake(String m) {
        make = m;
    }
    
    //Mutator method for setting the speed
    public void setSpeed(int s) {
        speed = s;
    }
   
    //Accessor method for getting the year
    public int getYearModel() {
        return yearModel;
    }
    
    //Accessor method for getting the make
    public String getMake() {
        return make;
    }
    
    //Accessor method for getting the speed
    public int getSpeed() {
        return speed;
    }
    
    //Accessor method for accelerating the car
    public int Accelerate() {
        speed += 5;
        return speed;
    }
    
    //Accessor method for using the brake
    public int Brake() {
        speed -= 5;
        return speed;
    }
}

