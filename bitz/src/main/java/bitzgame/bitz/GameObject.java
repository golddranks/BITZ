/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitzgame.bitz;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Timo
 */
public class GameObject {
    private double x;
    private double y;
    private int value;
    private Image sprite;
    private String name;
    
    
    
    public GameObject(double nowx, double nowy, String sprpath) throws SlickException{
        x = nowx;
        y = nowy;
        sprite = new Image(sprpath);
    }
    
    public GameObject(double nowx, double nowy, String sprpath, String itemname) throws SlickException{
        x = nowx;
        y = nowy;
        sprite = new Image(sprpath);
        name = itemname;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int a){
        this.value = a;
    }
    
    
    public void setSprite(String sprpath) throws SlickException{
        this.sprite = new Image(sprpath);
    }
    
    public Image getSprite(){
        return this.sprite;
    }
    
    
    public void moveX(double addX){
        this.x += addX;
    }
 
    public void moveY(double addY){        
        this.y += addY;
    }
    
    public double getY(){
        return this.y;        
    }
    
    public double getX(){
        return this.x;
    }
    
    
    
}


