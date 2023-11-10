import java.util.Scanner;

class EmpDemo {
    int id;
    String name;
    static String company = "Techno";

    EmpDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }
}

class Emp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            EmpDemo ed = new EmpDemo(id, name);
            ed.display();
        }
    
    }
}
