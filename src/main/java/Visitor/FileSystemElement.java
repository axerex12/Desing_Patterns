package main.java.Visitor;

public interface FileSystemElement {

    void accept(FileSystemVisitor visitor);
    
}
