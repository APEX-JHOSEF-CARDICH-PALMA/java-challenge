public class Customer implements  Person {
    private String name;
    private int age;
    private String id;
    private static int customerIdGenerator=0;
    private int customerId;

    public Customer(String name,int age, String id){
        this.name=name;
        this.id=id;
       this. customerId = Customer.customerIdGenerator++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    public static int getCustomerIdGenerator() {
        return customerIdGenerator;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
