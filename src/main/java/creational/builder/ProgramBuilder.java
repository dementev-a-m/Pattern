package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public abstract class ProgramBuilder {
    Program program;
    void createProgram() {
        program = new Program();
    }
    abstract void buildName();
    abstract void buildServer();
    abstract void buildPrice();

    public Program getProgram() {
        return program;
    }
}
