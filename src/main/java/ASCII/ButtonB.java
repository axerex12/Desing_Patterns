package main.java.ASCII;

class ButtonB extends Button {
    public ButtonB(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("<<-------------------->>");
        System.out.println("<< ButtonB: " + text + " >>");
        System.out.println("<<-------------------->>");
    }
}
