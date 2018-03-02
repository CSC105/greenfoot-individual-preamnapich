import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playbutton extends Actor
{
    /**
     * Act - do whatever the playbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        onMouse();
        if(Greenfoot.mouseClicked(this)){
            ((Barbieworld)(getWorld())).stopped();
            Greenfoot.setWorld(new MyWorld());
        }
    } 
    // Change image if mouse click on play button
    public void onMouse(){
        if(Greenfoot.mouseMoved(this)){
            setImage("playbutton-2.png");
        }else{
            setImage("playbt.png");
        }
    }
}
