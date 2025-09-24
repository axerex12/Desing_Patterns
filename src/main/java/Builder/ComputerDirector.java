package main.java.Builder;

public class ComputerDirector {

    public ComputerDirector(ComputerBuilder builder) {
    }

    public void buildGamingPc(ComputerBuilder gamingBuilder) {
        gamingBuilder.buildProcessor();
        gamingBuilder.buildRam();
        gamingBuilder.buildHardDrive();
        gamingBuilder.buildGpu();
        gamingBuilder.buildOS();
    }

    public void buildOfficePc(ComputerBuilder officeBuilder) {
        officeBuilder.buildProcessor();
        officeBuilder.buildRam();
        officeBuilder.buildHardDrive();
        officeBuilder.buildGpu();
        officeBuilder.buildOS();
    }
    
}
