package ZooDatabase;

public class Lion extends ZooTracked{
    private final int age;
    public Lion(String name, int GPStagID, int age) {
        super(name, GPStagID);
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
