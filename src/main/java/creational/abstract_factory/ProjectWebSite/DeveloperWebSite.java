package creational.abstract_factory.ProjectWebSite;

import creational.abstract_factory.Developer;

/**
 * Created by adementev on 31.03.2017.
 */
public class DeveloperWebSite implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Создан разработчик сайта");
    }
}
