import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cupcake4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cupcake4 extends Actor
{
    /**
     * Act - do whatever the cupcake4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int points = 15;
    
    public void act() 
    {
        setLocation(getX(),getY()+3);
        //collect();
        deleteOnEdge();
        
    }  
    // if the object reaches the edge, remove that object
    public void deleteOnEdge(){
        if(isAtEdge() == true){
            getWorld().removeObject(this);
        }
    
    }
    
    public void collect(){
        if(isAtEdge() == false){
            if(isTouching(Barbie.class)){
                getWorld().removeObject(this);
                MyWorld.updateScore(points);
            }
        }
    }
}
