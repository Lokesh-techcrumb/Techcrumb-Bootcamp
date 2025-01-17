package java1Assignment;

public class employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public employee() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "";
    }

    public employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.designation = "";
    }

    public employee(int age, String designation) {
        this.firstName = "";
        this.lastName = "";
        this.age = age;
        this.designation = designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Details: " +
                "First Name=" + firstName +
                ", Last Name=" + lastName +
                ", Age=" + age +
                ", Designation='" + designation;
    }
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee("Lokesh", "Sharma");
        employee emp3 = new employee(21, "developer");
        employee emp4 = new employee("Lokesh", "Sharma", 21, "developer");

        emp1.setAge(21);
        emp1.setDesignation("Developer");
        emp1.setFirstName("Lokesh");
        emp1.setLastName("Sharma");

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
    }
}
