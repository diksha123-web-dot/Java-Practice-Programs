class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Diksha", 30000);
        e.display();
    }
}