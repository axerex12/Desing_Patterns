package main.java.Decorator;



public class EncryptedPrinter extends OratorDecorator {


    public EncryptedPrinter(Orator orator) {
        super(orator);
    }

    @Override
    public void say (String message){
        String encryptedMessage = encrypt(message);
        super.say(encryptedMessage);

    }

    //Caesar Cipher 
    private String encrypt(String message){
        StringBuilder encrypted = new StringBuilder();
        int shift = 3;
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + shift));
        }
        return encrypted.toString();
    }
    
}
