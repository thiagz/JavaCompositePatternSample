/*
 * Sub-class of Main Monster
 * This Monster can Crawl
 * 
 */
package com.thiagz.composite.monster;

/**
 *
 * @author Thiagz
 */
public class CrawlingMonster implements Monster{
    
    @Override
    public void action(){
        //Have your own logic
        System.out.println("I believe I can Crawl..I'm a Crawling Monster");
    }
}
