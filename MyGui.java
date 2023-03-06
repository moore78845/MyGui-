import ecs100.*;
import java.awt.Color;
/**
 * makeing some sliders and responding to mouse events
 *
 * @author (Ruth)
 * @version (07/03)
 */
public class MyGui
{
    // instance variables - replace the example below with your own
    private double speed;

    /**
     * Constructor for objects of class MyGui
     */
    public MyGui()
    {
        // initialise instance variables
       speed = 0;
       
       // set up some buttons 
       UI.addButton("Quit", UI::quit);
       
       //setup slider
       UI.addSlider("Speed", 0, 100, 20, this::setSpeed);
       
    }
    
    //callback method for speed slider 
    public void setSpeed(double km){
    // check if it is greater or less than last speed.
    if(speed< km){
    UI.println("accelerating");}
    else if(speed>km){
    UI.println("decerlating");}
    else {UI.println("stationary");}
    this.speed = km;
    
}
}
