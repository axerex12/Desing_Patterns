package main.java.Builder;

public class GamingPcBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String Gpu;
    private String OS;

    public void buildProcessor() {
        this.processor = "Intel Core i9";
    }
    public void buildRam() {
        this.ram = 64;
    }
    public void buildHardDrive() {
        this.hardDrive = "1TB SSD";
    }
    public void buildGpu() {
        this.Gpu = "NVIDIA GeForce RTX 5090";
    }
    public void buildOS() {
        this.OS = "Windows 13";
    }

    public Computer build(){
        return new Computer(processor, ram, hardDrive, Gpu, OS);
    }
    
}
