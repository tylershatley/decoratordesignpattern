/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class Sedan extends Vehicle {

    //Creates a new car with the description sedan
    public Sedan() {
        this.description = "Sedan";
    }

    //Returns the price of the sedan which is $20,000
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 20000;
    }
}