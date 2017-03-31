package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public class CRMBuilder extends ProgramBuilder {
    @Override
    void buildName() {
        program.setName("MyCRM");
    }

    @Override
    void buildServer() {
        program.setServer(Server.TomCat);
    }

    @Override
    void buildPrice() {
        program.setPrice(1000);

    }
}
