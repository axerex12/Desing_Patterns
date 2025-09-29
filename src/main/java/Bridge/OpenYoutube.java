package main.java.Bridge;

import java.awt.Desktop;
import java.net.URI;

public class OpenYoutube  {

    public void openWebpage() throws Exception {

    Desktop desktop = Desktop.getDesktop();
    desktop.browse(URI.create("https://www.youtube.com/watch?v=zSpg77VNQ8A"));
}
    
}
