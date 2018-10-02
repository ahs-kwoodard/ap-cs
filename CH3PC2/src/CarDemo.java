/**
 * Kai'lani Woodard
 * CH3PC2 - Car Demo 
 * Programming II - AP CS
 * 10-3-2018
 */

public class CarDemo {

    public static void main(String[] args) {
        //Car object
        Car BMW = new Car(2006, "330xi", 88);
        
        System.out.println(BMW.getYearModel() + " BMW " + BMW.getMake());
        
        //Call accelerate five times and display in console
        for (int i=0; i<5; i++) {
            BMW.Accelerate();
            System.out.println("Current Speed: " + BMW.getSpeed());
        }
        
        //Call brake five times and display in console
        for (int i=0; i<5; i++) {
            BMW.Brake();
            System.out.println("Current Speed: " + BMW.getSpeed());
        }
        
        
        
    }

}
