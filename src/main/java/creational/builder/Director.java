package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public class Director {

    ProgramBuilder builder;

    public void setBuilder(ProgramBuilder builder) {
        this.builder = builder;
    }
    Program buildProgram(){
        builder.createProgram();
        builder.buildName();
        builder.buildServer();
        builder.buildPrice();

        Program program = builder.getProgram();
        return program;
    }
}
