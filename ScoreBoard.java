import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage(100, 50);
    
    public void act() 
    {
        makeSB();
    }    
    
    public void makeSB(){
        String score = MyWorld.getScore();
        image.clear();
        image.setColor(Color.PINK);
        image.fillRect(0, 0, 100, 50);
        image.setColor(Color.PINK);
        image.fillRect(2, 2, 95, 45);
        
        image.setColor(Color.WHITE);
        image.drawString("SCORE : ", 20, 25);

     
        image.drawString(score, 70, 25);
        setImage(image);
    }
}
