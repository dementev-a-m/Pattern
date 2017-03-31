package creational.abstract_factory.ProjectWebSite;


import creational.abstract_factory.ProjectManager;

public class PMWebSite implements ProjectManager {
    @Override
    public void managment() {
        System.out.println("Создан PM сайта");
    }
}
