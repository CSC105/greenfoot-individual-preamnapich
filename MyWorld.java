import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bahbah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class bahbah.
     * 
     */
    int delay;
    private static int score;
    GreenfootSound music = new GreenfootSound("barbiesong-2.mp3");
    boolean start = true;
    public boolean end = false;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score = 0;
        
        System.out.println("Gift");

        ScoreBoard sb = new ScoreBoard();
        addObject(sb, 548, 27);
        prepare();
    }
    
    
    // Set cupcakes to Random falling
    public void act(){
        int random = Greenfoot.getRandomNumber(5);
        delay++;
        if(delay > 50){
            if(random == 0){
                addObject(new cupcake1(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            else if(random == 1){
                addObject(new cupcake2(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            else if(random == 2){
                addObject(new cupcake3(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            else if(random == 3){
                addObject(new cupcake4(),Greenfoot.getRandomNumber(getWidth()),0);
            }else {
                addObject(new blackcupcake(), Greenfoot.getRandomNumber(getWidth()), 0);
            }

            delay = 0;
        }

        //spawn();
        
        //Add Sound

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

    

    public static void updateScore(int s){
        score += s;
    }

    public static String getScore(){
        return score + "";
    }

    public void stopped(){
        music.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    // Set Flamingo's Heart 
    private void prepare()
    {
        Heart h = new Heart();
        addObject(h,28,26);
        h.setLocation(467,21);
        Heart h2 = new Heart();
        addObject(h2,64,28);
        h2.setLocation(427,21);
        Heart h3 = new Heart();
        addObject(h3,102,28);
        h3.setLocation(387,21);
        Heart[] hearts = new Heart[3];
        hearts[0] = h3;
        hearts[1] = h2;
        hearts[2] = h;
        Barbie bb = new Barbie(hearts);
        addObject(bb,300,300);
    }
}
