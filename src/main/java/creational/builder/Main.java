package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CRMBuilder());
        Program program = director.buildProgram();

        System.out.println(program);

    }
}
