public class EmployeeManagementSystem {

    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");

        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                System.out.println("Employee Found:");
                System.out.println(employees[i]);
                return;

            }
        }

        System.out.println("Employee Not Found.");
    }

    // Traverse Employees
    public void traverseEmployees() {

        if (count == 0) {

            System.out.println("No Employees Available.");
            return;

        }

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < count; i++) {

            System.out.println(employees[i]);

        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                index = i;
                break;

            }
        }

        if (index == -1) {

            System.out.println("Employee Not Found.");
            return;

        }

        for (int i = index; i < count - 1; i++) {

            employees[i] = employees[i + 1];

        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted Successfully.");
    }

    public static void main(String[] args) {

        EmployeeManagementSystem em = new EmployeeManagementSystem(5);

        em.addEmployee(new Employee(101, "Vedika", "Manager", 75000));
        em.addEmployee(new Employee(102, "Rahul", "Developer", 60000));
        em.addEmployee(new Employee(103, "Sneha", "Tester", 50000));
        em.addEmployee(new Employee(104, "Amit", "Designer", 55000));

        em.traverseEmployees();

        System.out.println();

        em.searchEmployee(102);

        System.out.println();

        em.deleteEmployee(103);

        System.out.println();

        em.traverseEmployees();
    }
}

// output
// Employee Added Successfully.
// Employee Added Successfully.
// Employee Added Successfully.
// Employee Added Successfully.

// Employee Records:
// Employee ID: 101, Name: Vedika, Position: Manager, Salary: ?75000.0
// Employee ID: 102, Name: Rahul, Position: Developer, Salary: ?60000.0
// Employee ID: 103, Name: Sneha, Position: Tester, Salary: ?50000.0
// Employee ID: 104, Name: Amit, Position: Designer, Salary: ?55000.0

// Employee Found:
// Employee ID: 102, Name: Rahul, Position: Developer, Salary: ?60000.0

// Employee Deleted Successfully.


// Employee Records:
// Employee ID: 101, Name: Vedika, Position: Manager, Salary: ?75000.0
// Employee ID: 102, Name: Rahul, Position: Developer, Salary: ?60000.0
// Employee ID: 104, Name: Amit, Position: Designer, Salary: ?55000.0