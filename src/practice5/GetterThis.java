package practice5;

public class GetterThis  {
    public static void main(String[] args) {
        Application app = new Application();
        app.setName("Sompa Forever");
        app.setAge(25);
        System.out.println(app.getAge());
        System.out.println(app.getName());
    }
}
