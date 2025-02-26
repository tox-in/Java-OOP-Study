package mis;

public class Employee extends Person {
    private String institution;
    private String position;
    private Long salary;


//    The way we can use super for accessing the members of superclass from subclass

//    public Employee(int age, String firstName, String lastName, String institution, String position, Long salary) {
//        super(age, firstName, lastName);
//        this.institution = institution;
//        this.position = position;
//        this.salary = salary;
//    }


    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "institution='" + institution + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
