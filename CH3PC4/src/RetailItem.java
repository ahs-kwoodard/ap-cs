/**
 * Kai'lani Woodard
 * CH3PC3 - Retail Item
 * Programming II - AP CS
 * 10-3-2018
 */

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    //Constructor
    public RetailItem(String d, int u, double p) {
        description = d;
        unitsOnHand = u;
        price = p;
    }
    
    //Mutator method - Setting Description
    public void setDescription(String d) {
        description = d;
    }
    
    //Mutator method - Setting Units on Hand
    public void setUnitsOnHand(int u) {
        unitsOnHand = u;
    }
    
    //Mutator method - Setting Price
    public void setPrice(double p) {
        price = p;
    }
    
    //Accessor method - Getting the description
    public String getDescription() {
        return description;
    }
    
    //Accessor method - Getting the units on hand
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    
    //Accessor method - Getting the price
    public double getPrice() {
        return price;
    }
    
}
