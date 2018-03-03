import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbie extends Actor
{
    private int x = 1;
    
    boolean isRight = true;
    int cnt = 0;
    int heart = 0;
    Heart[] hearts;
    
    // Barbie's Hearts
    public Barbie(Heart[] h){
        hearts = h;
    }
    
    /**
     * Act - do whatever the Barbie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        /*
        if(isRight = true){
            animate();
        }else{
            animateL();
        }*/
        
        //animate();
        collectCupcake();
        //changeTouni();
        gameover();
    }    
    
    // Set Barbie to move right and left 
    public void move(){
        if(Greenfoot.isKeyDown("left")){
            move(-8);
            animateL();
            isRight = false;
        }else if(Greenfoot.isKeyDown("right")){
            move(8);
            animate();
            isRight = true;
        }
    
    
    }
    // Set Barbie can move her wing on the right side
    public void animate(){
        
        String[] str = new String[36];
        for(int i = 1; i < str.length; i++){
            
           str[i] = "Flamingo"+i+".png";
           cnt++;
           if(cnt == 36){
               setImage(str[i]);
               cnt = 0;
           }
           
           
        }
    }
    // Set Barbie can move her wing on the left side
    public void animateL(){
        
        String[] str = new String[36];
        for(int i = 1; i < str.length; i++){
            
           str[i] = "FlamingoL"+i+".png";
           cnt++;
           if(cnt == 36){
               setImage(str[i]);
               cnt = 0;
           }
           
           
        }
    }

    
    // Set Gameover if barbie eat black cupcake
    public void gameover(){
        Actor blackcupcake = getOneIntersectingObject(blackcupcake.class);
        if(blackcupcake != null){
            getWorld().removeObject(blackcupcake);
            GreenfootSound music = new GreenfootSound("failed.wav");
            music.play();
            if(heart < 2){
                getWorld().removeObject(hearts[heart]);
                heart += 1;
            }else{
                getWorld().removeObject(hearts[heart]);
                ((MyWorld)(getWorld())).stopped();
                Greenfoot.setWorld(new Gameover());
            }
        }
        
    }
    
    public void collectCupcake(){
        //Actor cupcake = getOneIntersectingObject(CupCake.class);
        Actor cupcake1 = getOneIntersectingObject(cupcake1.class);
        Actor cupcake2 = getOneIntersectingObject(cupcake2.class);
        Actor cupcake3 = getOneIntersectingObject(cupcake3.class);
        Actor cupcake4 = getOneIntersectingObject(cupcake4.class);
        
            if(isTouching(cupcake1.class)){
                int points = 1;
                getWorld().removeObject(cupcake1);
                MyWorld.updateScore(points);
                GreenfootSound music = new GreenfootSound("eat.mp3");
                music.play();
            }
            if(isTouching(cupcake2.class)){
                int points = 5;
                getWorld().removeObject(cupcake2);
                MyWorld.updateScore(points);
                GreenfootSound music = new GreenfootSound("eat.mp3");
                music.play();
            }
            if(isTouching(cupcake3.class)){
                int points = 10;
                getWorld().removeObject(cupcake3);
                MyWorld.updateScore(points);
                GreenfootSound music = new GreenfootSound("eat.mp3");
                music.play();
            }
            if(isTouching(cupcake4.class)){
                int points = 15;
                getWorld().removeObject(cupcake4);
                MyWorld.updateScore(points);
                GreenfootSound music = new GreenfootSound("eat.mp3");
                music.play();
            }
        
    }
}
