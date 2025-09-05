package main.java.State;

import main.java.State.States.ExpertState;
import main.java.State.States.IntermediateState;
import main.java.State.States.MasterState;
import main.java.State.States.NoviceState;

public class Character {
    private State state;
    private String name;
    private double XP;
    private double maxHP;
    private double HP;

    public Character(String name) {
        state = new NoviceState(this);
        this.name = name;
        this.XP = 0;
        this.maxHP = 10;
        this.HP = 10;
    }

    public Double getMaxHp(){
        return this.maxHP;
    }

    public void train(){
        state.train();
        levelUp();

    }

    public void meditate(){
        state.meditate();
    }

    public void fight(){
        state.fight();
        levelUp();
    }


    public void addXP(double xp){
        this.XP += xp;
    }

    public void addHP(double hp){
        this.HP += hp;
        if(this.HP > this.maxHP){
            this.HP = this.maxHP;
        }
        else if(this.HP <= 0){
            System.out.println("you are dead!");
        }
    }

    public void levelUpHp(){
        this.maxHP += 10;
        this.HP = this.maxHP;
    }

    public void levelUp() {
        if (this.XP >= 15 && getStateName().equals("NoviceState")) {
            state = new IntermediateState(this);
            levelUpHp();
        } else if (this.XP >= 60 && getStateName().equals("IntermediateState")) {
            state = new ExpertState(this);
            levelUpHp();
        } else if (this.XP >= 240 && getStateName().equals("ExpertState")) {
            state = new MasterState(this);
            System.out.println("You are now a master!");
            System.out.println("You win! Game Over");
        }
    }
    
    public String getName() {
        return name;
    }

    public double getXP() {
        return XP;
    }

    public double getHP() {
        return HP;
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }

    public boolean isDead() {
        return HP <= 0;
    }

    public boolean isMaster() {
        return state instanceof MasterState;
    }
}
