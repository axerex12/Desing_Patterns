package main.java.Builder;

public class OfficePcBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String Gpu;
    private String OS;

    public void buildProcessor() {
        this.processor = "Intel Core i5";
    }
    public void buildRam() {
        this.ram = 4;
    }
    public void buildHardDrive() {
        this.hardDrive = "245mb SSD";
    }
    public void buildGpu() {
        this.Gpu = "CPU Integrated Graphics";
    }
    public void buildOS() {
        this.OS = "windows xp";
    }

    public Computer build(){
        return new Computer(processor, ram, hardDrive, Gpu, OS);
    }
    
}
