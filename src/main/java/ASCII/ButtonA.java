package main.java.ASCII;

class ButtonA extends Button {
    public ButtonA(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("[======================]");
        System.out.println("[ ButtonA: " + text + " ]");
        System.out.println("[======================]");
    }
}
