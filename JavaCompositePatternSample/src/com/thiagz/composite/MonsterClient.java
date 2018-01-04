/*
 * Client class used to test Composite Pattern
 */
package com.thiagz.composite;

import com.thiagz.composite.monster.CompositeMonster;
import com.thiagz.composite.monster.CrawlingMonster;
import com.thiagz.composite.monster.FlyingMonster;
import com.thiagz.composite.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class MonsterClient {
    public static void main(String args[]){
        
        Monster flyingMonster = new FlyingMonster();
        Monster crawlingMonster = new CrawlingMonster();
        
        CompositeMonster compMonster = new CompositeMonster();
        compMonster.addMonster(flyingMonster);
        compMonster.addMonster(crawlingMonster);
        compMonster.action();
    }
}
