/**
 * Kai'lani Woodard
 * CH3PC1 - Employee Class
 * Programming III - AP CS
 * 9-25-2018
 */

    //Write accessor and mutator methods for each field
    
    //Provide documentation comment for each method
    
    //Write a constructor that accepts arguemnets for all 4 fields

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //Constructor!!
    public Employee(String n, int i, String d, String p) {
    name = n;
    idNumber = i;
    department = d;
    position = p;
}
    //Mutator method - Sets Name
    public void setName(String n) {
        name = n;
    }
    
    //Mutator method - Sets ID number value
    public void setID(int i) {
        idNumber = i;
    }
    
    //Mutator method - Sets Department
    public void setDepartment(String d) {
        department = d;
    }
    
    //Mutator method - Sets Position
    public void setPosition(String p) {
        position = p;
    }
    
    //Accessor method - Returns given name value
    public String getName() {
        return name;
    }
    
    //Accessor method - Returns given ID number
    public int getId() {
        return idNumber;
    }
    
    //Accessor method - Returns given department value
    public String getDepartment() {
        return department;
    }
    
    //Accessor method - Returns given position value
    public String getPosition() {
        return position;
    }
    
    
}

