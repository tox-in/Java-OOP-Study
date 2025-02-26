package mis;

public class App {
    public static void main(String[] args){
        Person peter = new Person(14,"Peter", "Mugisha");
        System.out.println(peter.toString());

        Person pi2 = new Employee();
        pi2.setFirstName("Peter");
        pi2.setLastName("Mugisha");
        pi2.setAge(15);
        System.out.println(pi2.getFirstName());


        Employee pi1 = new Employee();
        pi1.setFirstName("Peter");
        pi1.setLastName("Mugisha");
        pi1.setAge(15);
        pi1.setInstitution("RCA");
        pi1.setPosition("Chef");
        pi1.setSalary(60000L);

        System.out.println(pi1.toString());
    }
}
