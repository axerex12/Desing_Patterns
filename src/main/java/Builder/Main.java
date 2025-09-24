package main.java.Builder;

public class Main {
    public static void main(String[] args) {

        ComputerBuilder gamingComputerBuilder = new GamingPcBuilder();
        ComputerDirector director = new ComputerDirector(gamingComputerBuilder);
        director.buildGamingPc(gamingComputerBuilder);
        Computer gamingComputer = gamingComputerBuilder.build();
        System.out.println(gamingComputer.toString());

        ComputerBuilder officeComputerBuilder = new OfficePcBuilder();
        director = new ComputerDirector(officeComputerBuilder);
        director.buildOfficePc(officeComputerBuilder);
        Computer officeComputer = officeComputerBuilder.build();
        System.out.println(officeComputer.toString());


    }
    
}
