package creational.abstract_factory;

/**
 * Created by adementev on 31.03.2017.
 */
public interface TeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createProjectManager();
}
