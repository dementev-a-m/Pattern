package creational.abstract_factory.ProjectBank;

import creational.abstract_factory.Developer;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.TeamFactory;
import creational.abstract_factory.Tester;

/**
 * Created by adementev on 31.03.2017.
 */
public class TeamFactoryBank implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new DeveloperBank();
    }

    @Override
    public Tester createTester() {
        return new TesterBank();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new PMBank();
    }
}
