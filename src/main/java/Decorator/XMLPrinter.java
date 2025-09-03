package main.java.Decorator;

public class XMLPrinter extends OratorDecorator {

    public XMLPrinter(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        String xmlMessage = "<message>" + message + "</message>";
        super.say(xmlMessage);
    }
    
}
