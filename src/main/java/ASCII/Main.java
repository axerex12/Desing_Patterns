package main.java.ASCII;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button button = factory.createButton("Click On Me");
        TextField textField = factory.createTextField("Enter Your Name");
        Checkbox checkbox = factory.createCheckbox("Accept Terms");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("Submit");
        textField.setText("Enter Age");
        checkbox.setText("Accept Terms");
    }
}
