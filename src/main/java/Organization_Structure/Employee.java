package main.java.Organization_Structure;

 class Employee implements OrganizationComponent {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent component) {
        System.out.println("Cannot add to an employee.");
    }
    @Override
    public void remove(OrganizationComponent component) {

        System.out.println("Cannot remove from an employee.");
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<Employee name=\"" + name + "\" salary=\"" + salary + "\" />");
    }
    
}
