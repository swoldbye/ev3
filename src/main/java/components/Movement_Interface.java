package components;

public interface Movement_Interface {

    //spin the cart is a certain angle (degrees) relative to the arena... based on starting position of cart.
    void spinOnAxis(int degrees);

    //move forward in meters
    void forwardByDist(int cm);

    //move backward in meters
    void backwardByDist(int meters);

    void stop();

}
