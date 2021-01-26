/**
 * 
 */
package decoratordesignpattern;

/**
 * @author tylershatley
 *
 */
public abstract class Vehicle {
    protected String description;
    
    //String method that returns vehicle description
    public String toString() {
        return description;
    }
    //abstract method that getsCost
    public abstract double getCost();
}