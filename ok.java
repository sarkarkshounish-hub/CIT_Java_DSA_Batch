// class Employee {
//     int id;
//     String name;
//     double salary;
//     void display() {
//         System.out.println("Employee ID: " + id);
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee Salary: " + salary);
//     }
//     public class ok{
//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         emp.id = 101;
//         emp.name = "Rahul";
//         emp.salary = 30000;
//         emp.display();
//     }
//     }
// }

// class BankAccount {
//     double balance = 5000;
//     void deposit(double amount) {
//         balance = balance + amount;
//     }
//     void withdraw(double amount) {
//         if (amount <= balance) {
//             balance = balance - amount;
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }
//     void displayBalance() {
//         System.out.println("Current Balance: " + balance);
//     }
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();
//         account.displayBalance();
//         account.deposit(2000);
//         account.displayBalance();
//         account.withdraw(1000);
//         account.displayBalance();
//     }
// }

// class Car {
//     String brand;
//     String model;
//     double price;
//     Car(String brand, String model, double price) {
//         this.brand = brand;
//         this.model = model;
//         this.price = price;
//     }
//     void display() {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Price: " + price);
//     }
//     public static void main(String[] args) {
//         Car car = new Car("Toyota", "Corolla", 1500000);
//         car.display();
//     }
// }


