package main.java.Organization_Structure;

import java.util.ArrayList;
import java.util.List;

class Department implements OrganizationComponent {
    private String name;
    private List <OrganizationComponent> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        children.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        if (children.contains(component)) {
            children.remove(component);
        } else {
            for (OrganizationComponent child : children) {
                if (child instanceof Department) {
                    ((Department) child).remove(component);
                }
            }
        }
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent component : children) {
            total += component.getSalary();
        }
        return total;
    }

    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<Department name=\"" + name + "\">");
        for (OrganizationComponent component : children) {
            component.printXML(indent + "    ");
        }
        System.out.println(indent + "</Department>");
    }
    
}
