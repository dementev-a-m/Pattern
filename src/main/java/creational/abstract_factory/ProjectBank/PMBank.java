package creational.abstract_factory.ProjectBank;

import creational.abstract_factory.ProjectManager;

/**
 * Created by adementev on 31.03.2017.
 */
public class PMBank implements ProjectManager {
    @Override
    public void managment() {
        System.out.println("Создан PM банка");
    }
}
