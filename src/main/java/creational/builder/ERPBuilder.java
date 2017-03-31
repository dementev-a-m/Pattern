package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public class ERPBuilder extends ProgramBuilder {
    @Override
    void buildName() {
        program.setName("MyERP");
    }

    @Override
    void buildServer() {
        program.setServer(Server.FishGlass);
    }

    @Override
    void buildPrice() {
        program.setPrice(800);
    }
}
