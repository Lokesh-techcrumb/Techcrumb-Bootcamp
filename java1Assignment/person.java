//Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.
package java1Assignment;

public class person {
    static String firstName = "Lokesh";
    static String lastName = "sharma";
    static int age = 21;

    //static block
    static {
        System.out.println("Static Block:- Firstname is: "+firstName+", Lastname is: " + lastName+", age is: " + age);
    }

    //static method
    static void printDetails(){
        System.out.println("Static Method:- Firstname is: "+firstName+", Lastname is: " + lastName+", age is: " + age);
    }
    
    public static void main(String[] args) {
        printDetails();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
}
