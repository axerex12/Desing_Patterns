package main.java.Organization_Structure;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Pekka", 5000);
        Employee emp2 = new Employee("Pate", 17000);
        Employee emp3 = new Employee("Maija", 44000);
        Employee emp4 = new Employee("Jami", 700);
        Employee emp5 = new Employee("DELETEME!", 10000);

        Department devDept = new Department("IT");
        Department Janitor = new Department("Janitors");
        Department mainDept = new Department("Headquarters");
        Department Useless = new Department("Useless");

        devDept.add(emp1);
        devDept.add(emp2);
        Useless.add(emp5);

        Janitor.add(emp3);

        mainDept.add(devDept);
        mainDept.add(Janitor);
        mainDept.add(Useless);
        mainDept.add(emp4);
        

        System.out.println("Total salary: " + mainDept.getSalary());


        System.out.println("xml:");
        mainDept.printXML("");

        System.out.println("BEFORE DELETING EMPLOYEE:5 and Useless");
        mainDept.remove(emp5);
        mainDept.remove(Useless);

        System.out.println("Total salary: " + mainDept.getSalary());


        System.out.println("xml:");
        mainDept.printXML("");
    }
}
