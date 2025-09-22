package main.java.Visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        File file1 = new File("doc.txt", 2);
        File file2 = new File("pic.jpg", 5);
        File file3 = new File("archive.zip", 10);

        Directory subDir = new Directory("projects");
        File file4 = new File("code.java", 1);
        File file5 = new File("muistiinpanot.txt", 3);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(file3);
        subDir.addElement(file4);
        subDir.addElement(file5);
        root.addElement(subDir);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size of files: " + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Found .txt files:");
        for (File f : searchVisitor.getFoundFiles()) {
            System.out.println(" - " + f.getName());
        }
    }
}
