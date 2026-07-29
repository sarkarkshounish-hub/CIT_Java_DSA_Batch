import java.util.Scanner;
public class day1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    //1. Print Full Name Store your full name in a String and print it.
 
       String fullName = "Kshounish Sarkar";
        System.out.println(fullName);

    // Take a name as input and print its first character,last character, Convert Name to Uppercase
         System.out.print("Enter your name: ");
         String name = sc.nextLine();
         System.out.println("First character: " + name.charAt(0));
         System.out.println("Last character: " + name.charAt(name.length() - 1));
         System.out.println("Uppercase Name: " + name.toUpperCase());

    
    //Input two integers and print their sum.
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        

    //Even or Odd  Input a number.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println( "Even");
        } else {
            System.out.println( "Odd");
        }


    //Largest of Two Numbers, Input two numbers.Print the larger one.
        System.out.print("Enter first number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num4 = sc.nextInt();
        if (num3 > num4) {
            System.out.println("Largest number = " + num3);
        } else if (num3 > num4) {
            System.out.println("Largest number = " + num4);
        } else {
            System.out.println("Both numbers are equal.");
        }

    //Input age. If age ≥18 Print Eligible to Vote Otherwise Not Eligible
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible");
        }

    sc.close();

    }
}