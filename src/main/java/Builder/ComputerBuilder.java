package main.java.Builder;

public interface ComputerBuilder {

    public void buildProcessor();

    public void buildRam();

    public void buildHardDrive();

    public void buildGpu();

    public void buildOS();

    public Computer build();

}
