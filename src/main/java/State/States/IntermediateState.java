package main.java.State.States;

import main.java.State.Character;
import main.java.State.State;

public class IntermediateState extends State {
    public IntermediateState(Character character){
        super(character);
    }

    @Override
    public void train(){
        character.addXP(10);
        System.out.println("Intermediate is training...");

    }

    @Override
    public void meditate(){
        double maxHP = character.getMaxHp();
        character.addHP(maxHP * 0.25);
        System.out.println("Intermediate is meditating...");

    }

    @Override
    public void fight(){
        System.out.println("intermidiate cant fight!");

    }

    
}
