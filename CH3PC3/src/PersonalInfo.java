/**
 * Kai'lani Woodard
 * CH3PC3 - Personal Info
 * Programming II - AP CS
 * 10-3-2018
 */

public class PersonalInfo {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    //Constructor
    public PersonalInfo(String n, String ad, int ag, String p) {
        name = n;
        address = ad;
        age = ag;
        phoneNumber = p;
}
    
    //Mutator method - Setting the name
    public void setName(String n) {
        name = n;
    }
    
    //Mutator method - Setting the address
    public void setAddress(String ad) {
        address = ad;
    }
    
    //Mutator method - Setting the age
    public void setAge(int ag) {
        age = ag;
    }
    
    //Mutator method - Setting the phone number
    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }
    
    //Accessor method - Getting the name
    public String getName() {
        return name;
    }
    
    //Accessor method - Getting the addresss
    public String getAddress() {
        return address;
    }
    
    //Accessor method - Getting the age
    public int getAge() {
        return age;
    }
    
    //Accessor method - Getting the phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}
