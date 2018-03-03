import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tryagain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tryagain extends Actor
{
    
    
    /**
     * Act - do whatever the tryagain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // Set Music
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((Gameover)(getWorld())).stopped();
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.mouseMoved(this)){
            setImage("try2.png");
        }else{
            setImage("try1.png");
        }
   
    }
   
}
