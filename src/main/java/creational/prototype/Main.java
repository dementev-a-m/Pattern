package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Project master = new Project(1, "Test", "Код епта");
        System.out.println(master);
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
