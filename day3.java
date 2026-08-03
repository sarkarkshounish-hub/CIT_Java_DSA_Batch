
// 1.
// class Animal {
//     void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     @Override
//     void makeSound() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     @Override
//     void makeSound() {
//         System.out.println("Cat meows");
//     }
// }
// public class day3 {
//      public static void main(String[] args) {
//         Animal a;
//         a = new Dog();
//         a.makeSound();
//         a = new Cat();
//         a.makeSound();
//     }
// }

// 2.
// class BankAccount {
//     String accountHolder;
//     double balance;
//     BankAccount() {
//         accountHolder = "New Customer";
//         balance = 0.0;
//     }
//     BankAccount(String accountHolder, double balance) {
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }
//      void display() {
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Balance: " + balance);
//     }
// }
// public class day3 {
//     public static void main(String[] args) {
//         BankAccount acc1 = new BankAccount();
//         BankAccount acc2 = new BankAccount("Kshounish Sarkar", 5000.0);
//         acc1.display();
//         acc2.display();
//     }
// }

// 3.
// class Employee {
//     double salary;
//     static String companyName = "mamata Company";
//     void raiseSalary(double amount) {
//         double newSalary = salary + amount;
//         salary = newSalary;
//     }
// }
// public class day3 {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();
//         Employee emp2 = new Employee();
//         emp1.salary = 30000;
//         emp2.salary = 45000;
//         System.out.println("Before changing company name:");
//         System.out.println("Emp1 Company: " + emp1.companyName);
//         System.out.println("Emp2 Company: " + emp2.companyName);
//         emp1.raiseSalary(5000);
//         System.out.println("Emp1 New Salary: " + emp1.salary);
//         emp1.companyName = "modi Company";
//         System.out.println("\nAfter changing company name:");
//         System.out.println("Emp1 Company: " + emp1.companyName);
//         System.out.println("Emp2 Company: " + emp2.companyName);
//     }
// }

// 4.
// class Person {
//     private String ssn;
//     protected String dateOfBirth;
//     String city;
//     public String firstName;
//     public String getSsn() {
//         return ssn;
//     }
//     public void setSsn(String ssn) {
//         if (ssn.length() == 9) {
//             this.ssn = ssn;
//         } else {
//             System.out.println("Invalid SSN! It must be exactly 9 characters.");
//         }
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Person person = new Person();
//         person.firstName = "Rahul";
//         person.city = "Kolkata";
//         person.dateOfBirth = "01-01-2000";
//         System.out.println("First Name: " + person.firstName);
//         System.out.println("City: " + person.city);
//         System.out.println("Date of Birth: " + person.dateOfBirth);
//         person.setSsn("123456789");
//         System.out.println("SSN: " + person.getSsn());
//         person.setSsn("123");
//         // System.out.println(person.ssn);
//     }
// }

// class ShapeCalculator {

//     static int shapesCalculated = 0;

//     static double area(double side) {
//         shapesCalculated++;
//         return side * side;
//     }

//     static double area(double length, double width) {
//         shapesCalculated++;
//         return length * width;
//     }

//     static double area(double base, double height, boolean isTriangle) {
//         shapesCalculated++;
//         return 0.5 * base * height;
//     }
// }

// public class day3 {

//     public static void main(String[] args) {

//         System.out.println("Square Area = " + ShapeCalculator.area(5));
//         System.out.println("Rectangle Area = " + ShapeCalculator.area(10, 4));
//         System.out.println("Triangle Area = " + ShapeCalculator.area(8, 6, true));

//         System.out.println("Total Shapes Calculated = " + ShapeCalculator.shapesCalculated);
//     }
// }

// 6
// class Product {
//     int id;
//     String name;
//     double price;
//     Product(int id, String name, double price) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }
// }
// public class day3 {
//     public static void main(String[] args) {
//         Product p = new Product(101, "Wireless Mouse", 19.99);
//         System.out.println(p);
//     }
// }

