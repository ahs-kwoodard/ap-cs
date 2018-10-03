/**
 * Kai'lani Woodard
 * CH3PC3 - Personal Info Demo
 * Programming II - AP CS
 * 10-3-2018
 */

public class PersonalInfoDemo {

    public static void main(String[] args) {
        //Personal instance
        PersonalInfo one = new PersonalInfo("Kai'lani", "420 Blazington Drive, "
                + "Kittanning, PA, 16201", 17, "(724)-867-5309");
        
        //Family and Relative instances
        PersonalInfo two = new PersonalInfo("Ariana", "690 Infidel Street, "
                + "Ford City, PA 16226", 16, "(724)-420-6969");
        PersonalInfo three = new PersonalInfo("Jimmy", "100 Address Avenue, "
                + "Townsville, PA 12345", 2, "(100)-234-5678");
        
        //Printing of instances
        System.out.println(one.getName() + " " + one.getAddress() + ", Age:" +
                one.getAge() + ", " + one.getPhoneNumber());
        System.out.println(two.getName() + " " + two.getAddress() + ", Age:" +
                two.getAge() + ", " + two.getPhoneNumber());
        System.out.println(three.getName() + " " + three.getAddress() + ", "
                + "Age:" + three.getAge() + ", " + three.getPhoneNumber());
        
    }
    
}
