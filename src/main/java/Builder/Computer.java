package main.java.Builder;

public class Computer {
    private String processor;
    private int ram;
    private String hardDrive;
    private String Gpu;
    private String OS;

    public Computer(String processor, int ram, String hardDrive, String Gpu, String OS) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.Gpu = Gpu;
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hardDrive='" + hardDrive + '\'' +
                ", Gpu='" + Gpu + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }

}
