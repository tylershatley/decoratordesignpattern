/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class SportsCar extends Vehicle {

    //Creates a new Vehicle with the description sports car
    public SportsCar() {
        this.description = "Sports Car";
    }

    //returns the cost of the sports car which is $30,000
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 30000;
    }
}