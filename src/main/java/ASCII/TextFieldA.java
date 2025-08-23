package main.java.ASCII;

class TextFieldA extends TextField {
    public TextFieldA(String text) { super(text); }
    @Override
    public void display() {
        System.out.println("+----------------------+");
        System.out.println("| TextFieldA: " + text + " |");
        System.out.println("+----------------------+");
    }
}
