package creational.prototype;

/**
 * Created by adementev on 31.03.2017.
 */
public class Project implements Copyble{
    private int id;
    private String name;
    private String sourceCode;

    public Project(int id, String name, String sourceCode) {
        this.id=id;
        this.name=name;
        this.sourceCode=sourceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id,name,sourceCode);
        return copy;

    }

    public String toString() {
        return "creational/prototype" +id + " " + name + " " + sourceCode;
    }
}
