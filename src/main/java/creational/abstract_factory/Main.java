package creational.abstract_factory;

import creational.abstract_factory.ProjectBank.TeamFactoryBank;
import creational.abstract_factory.ProjectWebSite.TeamFactoryWebSite;

/**
 * Created by adementev on 31.03.2017.
 */
public class Main {
    public static void main(String [] args) {
        TeamFactory teamFactory= createTeam("WebSite");
        Developer developer=teamFactory.createDeveloper();
        ProjectManager projectManager=teamFactory.createProjectManager();
        Tester tester =teamFactory.createTester();

        developer.writeCode();
        projectManager.managment();
        tester.testing();



    }
    public static TeamFactory createTeam(String project){
        switch (project){
            case "Bank":
                return new TeamFactoryBank();
            case "WebSite":
                return new TeamFactoryWebSite();
            default:
                return null;
        }
    }

}
