/*
 * This is the composite class of Monster interface
 */
package com.thiagz.composite.monster;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiagz
 */
public class CompositeMonster implements Monster{
    
    private final List<Monster> childMonsters;
    
    public CompositeMonster(){
        childMonsters = new ArrayList<>();
    }
    
    public void addMonster(Monster monster){
        childMonsters.add(monster);
    }
    
    public void removeMonster(Monster monster){
        childMonsters.remove(monster);
    }
    
    @Override
    public void action(){
        childMonsters.forEach((monster) -> {
            monster.action();
        });
    }
}
