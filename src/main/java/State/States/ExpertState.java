package main.java.State.States;

import main.java.State.Character;
import main.java.State.State;

public class ExpertState extends State {
    public ExpertState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        character.addXP(5);
        System.out.println("Expert is training...");
    }

    @Override
    public void meditate() {
        double maxHP = character.getMaxHp();
        character.addHP(maxHP * 0.25);
        System.out.println("Expert is meditating...");
    }

    @Override
    public void fight() {
        character.addXP(15);
        character.addHP(-(character.getMaxHp() * 0.3));
        System.out.println("Expert is fighting...");
    }
}
