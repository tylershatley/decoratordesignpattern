/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class Compact extends Vehicle {

    //Creates a new vehicle with description as a compact
    public Compact() {
        this.description = "Compact";
    }

    //compact car returns price of $15,000
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 15000;
    }
}