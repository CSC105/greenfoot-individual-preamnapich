import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{
    
    GreenfootSound music = new GreenfootSound("barbiesong.mp3");
    boolean start = true;
    public boolean end = false;

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ScoreBoard sb = new ScoreBoard();
        addObject(sb, 310,300);
        
        
    prepare();
}
/**
 * Prepare the world for the start of the program.
 * That is: create the initial objects and add them to the world.
 */
//Set location tryagain button
private void prepare()
{
    tryagain tryagain = new tryagain();
    addObject(tryagain,323,241);
    tryagain.setLocation(312,232);
    tryagain.setLocation(310,232);
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
