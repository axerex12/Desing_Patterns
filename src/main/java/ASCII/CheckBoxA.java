package main.java.ASCII;

class CheckboxA extends Checkbox {
    public CheckboxA(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("[ ]--------------------");
        System.out.println("[ ] CheckboxA: " + text);
        System.out.println("[ ]--------------------");
    }
}
