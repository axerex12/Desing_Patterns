package main.java.Builder;

public class ComputerDirector {

    public ComputerDirector(ComputerBuilder builder) {
    }

    public Computer buildGamingPc(ComputerBuilder builder) {
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHardDrive();
        builder.buildGpu();
        builder.buildOS();
        return builder.build();
    }

    public Computer buildOfficePc(ComputerBuilder builder) {
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHardDrive();
        builder.buildGpu();
        builder.buildOS();
        return builder.build();
    }
    
}
