/**
 * Kai'lani Woodard
 * CH3PC3 - Retail Item Demo
 * Programming II - AP CS
 * 10-3-2018
 */

public class RetailItemDemo {

    public static void main(String[] args) {
        RetailItem itemOne = new RetailItem("Crewneck", 42, 49.99);
        RetailItem itemTwo = new RetailItem("Bomber Jacket", 69, 69.99);
        RetailItem itemThree = new RetailItem("Glad Kitchen Odor Shield Bag", 
                100, 17.99);
        
        System.out.println("Description \t\t\t\tUnits on Hand \tPrice");
        System.out.println("---------------------------------------------"
                + "-----------------");
        System.out.println("Item #1\t" + itemOne.getDescription() + "\t\t\t"
                + itemOne.getUnitsOnHand() + "\t\t" + itemOne.getPrice());
        
        System.out.println("Item #2\t" + itemTwo.getDescription() + "\t\t\t"
                + itemTwo.getUnitsOnHand() + "\t\t" + itemTwo.getPrice());
        System.out.println("Item #3\t" + itemThree.getDescription() + "\t"
                + itemThree.getUnitsOnHand() + "\t\t" + itemThree.getPrice());
    }
    
}
