package main.java.Organization_Structure;

public interface OrganizationComponent {
    void add(OrganizationComponent component);
    double getSalary();
    void printXML(String indent);
    void remove(OrganizationComponent component);
}
