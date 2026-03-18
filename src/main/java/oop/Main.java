package oop;

public class Main {

    public static void main(String[] args) {
        testBankAccount();
        testCustomer();
        testStudent();
        testProduct();
        testOrder(); // optional
    }

    static void testBankAccount() {
        System.out.println("=== BankAccount ===");

        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 500);

        acc1.deposit(200);
        acc2.withdraw(100);

        System.out.println(acc1.getAccountHolder() + ": " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + ": " + acc2.getBalance());
    }

    static void testCustomer() {
        System.out.println("\n=== Customer ===");

        Customer c1 = new Customer(1, "Alice", "a@mail.com");
        Customer c2 = new Customer(2, "Bob", "b@mail.com");

        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }

    static void testStudent() {
        System.out.println("\n=== Student ===");

        Student s1 = new Student(101, "Alice", 20, "CS");
        Student s2 = new Student(102, "Bob", 22, "Engineering");

        System.out.println(s1.getName() + " - " + s1.getMajor());
        System.out.println(s2.getName() + " - " + s2.getMajor());
    }

    static void testProduct() {
        System.out.println("\n=== Product ===");

        Product p1 = new Product(1, "Laptop", 1200);
        Product p2 = new Product(2, "Phone", 800);

        System.out.println(p1.getName() + ": " + p1.getPrice());
        System.out.println(p2.getName() + ": " + p2.getPrice());
    }

    static void testOrder() {
        System.out.println("\n=== Order ===");

        Product p1 = new Product(1, "Laptop", 1200);
        Product p2 = new Product(2, "Mouse", 50);

        Order order = new Order(1);
        order.addProduct(p1);
        order.addProduct(p2);

        System.out.println("Total: " + order.calculateTotal());
    }
}