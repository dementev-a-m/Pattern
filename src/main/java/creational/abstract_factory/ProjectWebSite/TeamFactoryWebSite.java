package creational.abstract_factory.ProjectWebSite;

import creational.abstract_factory.Developer;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.TeamFactory;
import creational.abstract_factory.Tester;

/**
 * Created by adementev on 31.03.2017.
 */
public class TeamFactoryWebSite implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new DeveloperWebSite();
    }

    @Override
    public Tester createTester() {
        return new TesterWebSite();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new PMWebSite();
    }
}
