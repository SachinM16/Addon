import java.util.Scanner;
class Person {
    String name;
    int age;
    void getPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
    }
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    int empId;
    double basicPay, hra, da, salary;
    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }
    void calculateSalary() {
        salary = basicPay + hra + da;
    }
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + salary);
    }
}
public class PersonEmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.getPersonDetails(sc);
        emp.getEmployeeDetails(sc);
        emp.calculateSalary();
        System.out.println("\n--- Employee Details ---");
        emp.displayPersonDetails();
        emp.displayEmployeeDetails();
    }
}
