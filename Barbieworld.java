import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barbieworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbieworld extends World
{

    GreenfootSound music = new GreenfootSound("barbiesong.mp3");
    boolean start = true;
    public boolean end = false;
    
    /**
     * Constructor for objects of class Barbieworld.
     * 
     */
    public Barbieworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    // Play game button
    private void prepare()
    {
        playbutton playbutton = new playbutton();
        addObject(playbutton,371,99);
        playbutton.setLocation(365,108);
        playbutton.setLocation(366,105);
    }
    //Set Music 
    public void act(){
        if(start){
            music.playLoop();
            start = false;
        }
        
        if(end == true){
            stopped();
        }else {
            music.playLoop();
        }
    }
    
    public void stopped(){
        music.stop();
    }
}
