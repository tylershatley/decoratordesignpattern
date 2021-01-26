/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    //Creates new vehicle decoractor which means creates new Vehicle that has paint
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //Returns the orignal vehicle string along with fancy paint
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", fancy paint";
    }

    //returns the original vehicle cost + the cost of the fancy paint
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return vehicle.getCost() + 150;
    }
}