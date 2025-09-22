package main.java.Visitor;

public class File implements FileSystemElement {
    public String name;
    public int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public String getName(){
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }



    
}
