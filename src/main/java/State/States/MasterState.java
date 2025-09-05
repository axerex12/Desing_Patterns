package main.java.State.States;

import main.java.State.Character;
import main.java.State.State;

public class MasterState extends State {
    public MasterState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        // Implement Master-specific training logic here
    }

    @Override
    public void meditate() {
        // Implement Master-specific meditation logic here
    }

    @Override
    public void fight() {
        // Implement Master-specific fighting logic here
    }
}
