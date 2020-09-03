public class Main {

    public static void main(String args[]){
        System.out.println("Hi this is my first program to execute some functionalities of other classes");
        System.out.println("-----------------------------------------------------------------------------");
        Worker worker1 = new Worker("Juan","0424777",70,"Lima");
        Worker worker2 = new Worker("Pedro","0424777",70,"Lima");
        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        Customer customer1 = new Customer("David",20,"90232435");
        Customer customer2 = new Customer("Maria",20,"90232435");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

    }
}
