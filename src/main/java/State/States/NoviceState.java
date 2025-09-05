package main.java.State.States;

import main.java.State.Character;
import main.java.State.State;

public class NoviceState extends State {
    public NoviceState(Character character){
        super(character);
    }

    @Override
    public void train() {
        character.addXP(5);
        System.out.println("Novice is training...");
    }

    @Override
    public void meditate() {
        System.out.println("as a novice you can't meditate yet");
    }

    @Override
    public void fight() {
        System.out.println("as a novice you can't fight yet");
    }
}
