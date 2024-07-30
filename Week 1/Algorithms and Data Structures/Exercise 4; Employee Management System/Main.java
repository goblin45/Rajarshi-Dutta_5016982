import java.util.*; // for List and ArrayList

class Employee {
    protected int employeeId, salary;
    protected String employeeName, position;

    public Employee(int employeeId, String employeeName, String position, int salary) { 
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
    }
}

class EmpRecords {
    List<Employee> employees;

    EmpRecords() {
        this.employees = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        this.employees.add(e);
    }

    public Employee search(int employeeId) {
        for (Employee e : employees) {
            if (e.employeeId == employeeId) {
                return e;
            }
        }
        return null;
    }

    void printEmployee(Employee e) {
        if (e == null) {
            System.out.println("Employee not found");
            return;
        }
        System.out.println("Employee Id: " + e.employeeId);
        System.out.println("Employee Name: " + e.employeeName);
        System.out.println("Employee Position: " + e.position);
        System.out.println("Employee Salary: " + e.salary);
        System.out.println();
    }

    public void getAllEmployees() {
        for (Employee e : employees) {
            this.printEmployee(e);
        }
    }

    public void deleteEmployee(int employeeId) {
        Employee e = this.search(employeeId);
        if (e == null) {
            System.out.println("Employee not found");
            return;
        }
        employees.remove(e);
        System.out.println("Employee deleted successfully");
    }
}

public class Main {

    // insert 5 employees
    public static void insertEmployees(EmpRecords employees) {
        employees.add(new Employee(1, "John", "Manager", 10000));
        employees.add(new Employee(2, "Jane", "Manager", 20000));
        employees.add(new Employee(3, "Jim", "Manager", 30000));
        employees.add(new Employee(4, "Jill", "Manager", 40000));
        employees.add(new Employee(5, "Jack", "Manager", 50000));
    }

    public static void main(String[] args) {
        EmpRecords employees = new EmpRecords();
        insertEmployees(employees);

        System.out.println("Traversal:");
        employees.getAllEmployees();

        // search employee with id 5
        System.out.println("Search employee with id 5:");
        employees.printEmployee(employees.search(5));

        // delete employee with id 3
        employees.deleteEmployee(3);

        System.out.println("After deletion:");
        employees.getAllEmployees();
    }
}

/* 

Output: 

Traversal:
Employee Id: 1
Employee Name: John
Employee Position: Manager
Employee Salary: 10000

Employee Id: 2
Employee Name: Jane
Employee Position: Manager
Employee Salary: 20000

Employee Id: 3
Employee Name: Jim
Employee Position: Manager
Employee Salary: 30000

Employee Id: 4
Employee Name: Jill
Employee Position: Manager
Employee Salary: 40000

Employee Id: 5
Employee Name: Jack
Employee Position: Manager
Employee Salary: 50000

Search employee with id 5:
Employee Id: 5
Employee Name: Jack
Employee Position: Manager
Employee Salary: 50000

Employee deleted successfully
After deletion:
Employee Id: 1
Employee Name: John
Employee Position: Manager
Employee Salary: 10000

Employee Id: 2
Employee Name: Jane
Employee Position: Manager
Employee Salary: 20000

Employee Id: 4
Employee Name: Jill
Employee Position: Manager
Employee Salary: 40000

Employee Id: 5
Employee Name: Jack
Employee Position: Manager
Employee Salary: 50000

*/
