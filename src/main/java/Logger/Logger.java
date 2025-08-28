package main.java.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private String fileName;
    private FileWriter fw;
    private PrintWriter out;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private Logger() {
        this.fileName = "Default_Name.txt";
        initializeWriter();
    }

    public void setFileName(String fileName) {
        close();
        this.fileName = fileName;
        initializeWriter();
    }

    public void write(String text) {
        if (out != null) {
            out.println(text);
        } else {
            System.err.println("Logger is not initialized");
        }
    }

    public void close() {
        try {
            if (out != null) {
                out.close();
            }
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing logger resources: " + e.getMessage());
        }
    }

    private void initializeWriter() {
        try {
            fw = new FileWriter(fileName, true);
            out = new PrintWriter(fw);
        } catch (IOException e) {
            System.err.println("Error initializing logger: " + e.getMessage());
        }
    }
}
