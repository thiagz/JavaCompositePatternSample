/*
 * Sub-class of Main Monster
 * This Monster can Fly
 * 
 */
package com.thiagz.composite.monster;

/**
 *
 * @author Thiagz
 */
public class FlyingMonster implements Monster{
    
    @Override
    public void action(){
        //Have your own logic
        System.out.println("I believe I can Fly..I'm a Flying Monster");
    }
}
