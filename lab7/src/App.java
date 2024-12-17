import java.util.*;

// Class representing an Employee
class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Salary: " + salary + ")";
    }
}

// Class representing a Department
class Department {
    private String name;
    private Employee head;
    private List<Employee> employees;

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

// Class representing a Firm
class Firm {
    private String name;
    private Employee director;
    private List<Department> departments;

    public Firm(String name, Employee director) {
        this.name = name;
        this.director = director;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Employee getDirector() {
        return director;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Create sample data
        Employee director = new Employee("John", "Doe", 100000);
        Firm firm = new Firm("TechCorp", director);

        Employee dept1Head = new Employee("Alice", "Smith", 80000);
        Department dept1 = new Department("Development", dept1Head);
        dept1.addEmployee(new Employee("Bob", "Brown", 70000));
        dept1.addEmployee(new Employee("Charlie", "White", 85000));

        Employee dept2Head = new Employee("Eve", "Davis", 75000);
        Department dept2 = new Department("Marketing", dept2Head);
        dept2.addEmployee(new Employee("David", "Wilson", 72000));
        dept2.addEmployee(new Employee("Frank", "Johnson", 74000));

        firm.addDepartment(dept1);
        firm.addDepartment(dept2);

        // Task 1: Find maximum salary
        System.out.println("Maximum Salary: " + findMaxSalary(firm));

        // Task 2: Find departments with an employee earning more than the head
        System.out.println("Departments with employees earning more than the head:");
        findDepartmentsWithHigherSalaries(firm).forEach(System.out::println);

        // Task 3: Get a list of all employees
        System.out.println("All Employees:");
        listAllEmployees(firm).forEach(System.out::println);
    }

    // Task 1: Find the maximum salary using an untyped iterator
    public static double findMaxSalary(Firm firm) {
        double maxSalary = firm.getDirector().getSalary();
        Iterator<Department> departmentIterator = firm.getDepartments().iterator(); // Untyped iterator

        while (departmentIterator.hasNext()) {
            Department department = departmentIterator.next();
            maxSalary = Math.max(maxSalary, department.getHead().getSalary());
            for (Employee employee : department.getEmployees()) {
                maxSalary = Math.max(maxSalary, employee.getSalary());
            }
        }
        return maxSalary;
    }

    // Task 2: Find departments where an employee earns more than the head using a for-each loop
    public static List<String> findDepartmentsWithHigherSalaries(Firm firm) {
        List<String> departments = new ArrayList<>();

        for (Department department : firm.getDepartments()) { // For-each loop
            for (Employee employee : department.getEmployees()) {
                if (employee.getSalary() > department.getHead().getSalary()) {
                    departments.add(department.getName());
                    break;
                }
            }
        }

        return departments;
    }

    // Task 3: Get a list of all employees using a typed iterator
    public static List<Employee> listAllEmployees(Firm firm) {
        List<Employee> allEmployees = new ArrayList<>();

        allEmployees.add(firm.getDirector());

        Iterator<Department> departmentIterator = firm.getDepartments().iterator(); // Typed iterator
        while (departmentIterator.hasNext()) {
            Department department = departmentIterator.next();
            allEmployees.add(department.getHead());
            allEmployees.addAll(department.getEmployees());
        }

        return allEmployees;
    }
}