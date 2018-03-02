import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackcupcake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blackcupcake extends Actor
{
    /**
     * Act - do whatever the blackcupcake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // if the object reaches the edge, remove that object
    public void act() 
    {
        setLocation(getX(),getY()+3);
        if(isAtEdge() == true){
            getWorld().removeObject(this);
        }
    }    
}
