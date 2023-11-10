import java.util.Scanner;

class Employee {
    int id;
    String name;
    String company;
    Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    
    static boolean isTechnoCompany(String companyName) {
        return "techno".equalsIgnoreCase(companyName);
    }
}

 class EmployeeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for employee details
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();

        System.out.println("Enter employee name:");
        String name = scanner.next();

        System.out.println("Enter company name:");
        String company = scanner.next();

    
        Employee employee = new Employee(id, name, company);

        // Checking if the company name is "techno" using the static method
        if (Employee.isTechnoCompany(employee.company)) {
            System.out.println("Employee works at Techno!");
        } else {
            System.out.println("Employee does not work at Techno.");
        }
    }
}
