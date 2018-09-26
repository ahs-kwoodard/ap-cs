/**
 * Kai'lani Woodard
 * CH3PC1 - Employee
 * Programming III - AP CS
 * 9-25-2018
 */

        //Instantiate 3 Employee objects with the appropriate arguments
        //Use employee class methods (accessor) to print out table

public class EmployeeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instantiate Employee Objects
        Employee one = new Employee("Susan Meyers", 47899, "Accounting", 
                "Vice President");
        Employee two = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee three = new Employee("Joy Rogers", 81774, "Manufacturing",
            "Engineer");
        
        //Table header
        System.out.println("Name\t\tID Number\tDepartment\tPosition");
        //Call to employee class methods to print out table
        System.out.println(one.getName() + "\t" + one.getId() + "\t\t"
                + one.getDepartment() + "\t" + one.getPosition());
        System.out.println(two.getName() + "\t" + two.getId() + "\t\t"
                + two.getDepartment() + "\t\t" + two.getPosition());
        System.out.println(three.getName() + "\t" + three.getId() + "\t\t"
                + three.getDepartment() + "\t" + three.getPosition());
                
        
        
        
       
       
    }

}
