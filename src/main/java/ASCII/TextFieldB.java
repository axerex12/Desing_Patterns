package main.java.ASCII;

class TextFieldB extends TextField {
    public TextFieldB(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("╔══════════════════════╗");
        System.out.println("║ TextFieldB: " + text + " ║");
        System.out.println("╚══════════════════════╝");
    }
}
