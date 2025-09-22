package main.java.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private final String name;
    private final List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public String getName(){
        return name;
    }

    public void addFile(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
        for (FileSystemElement element : elements){
            element.accept(visitor);
        }
    }

    
}
    