package main.java.ASCII;

class CheckboxB extends Checkbox {
    public CheckboxB(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("[X]--------------------");
        System.out.println("[X] CheckboxB: " + text);
        System.out.println("[X]--------------------");
    }
}
