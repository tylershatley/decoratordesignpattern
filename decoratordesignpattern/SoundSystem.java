/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public class SoundSystem extends VehicleDecorator {
    private Vehicle vehicle;

    //Creates a new vehicle decorator therefore making a new vehicle with a sound system. BOOm boom subs in the car
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //Returns the orignal vehicle string plus awesome sound
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", awesome sound";
    }

    //Returns the original vehicle price + $350 for the price of the sound system
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return vehicle.getCost() + 350;
    }
}