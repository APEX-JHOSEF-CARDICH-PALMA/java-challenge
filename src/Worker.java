
public class Worker implements Person {
    private String name;
    private String id;
    private int age;
    private static int workerIdGenerator =0;
    private int workerId;
    private String workPlace;

    public Worker(String name, String id, int age, String workPlace) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.workPlace= workPlace;
        this.workerId = Worker.workerIdGenerator++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getAge() {
        return age;
    }

    public static int getWorkerIdGenerator() {
        return workerIdGenerator;
    }

    public int getWorkerId() {
        return workerId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", workerId=" + workerId +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}