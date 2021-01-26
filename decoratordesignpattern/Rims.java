/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    //creates a new vehicle decorator, therefore making a vehicle with da rims
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //Returns orignal vehicle description with the cool rims as well
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", cool rims";
    }

    //Returns the orignial vehicle cost + the cost of the rims which is $200
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return vehicle.getCost() + 200;
    }
}