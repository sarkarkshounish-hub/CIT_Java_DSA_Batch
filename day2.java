import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Check Palindrome String Input: madam
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //Count Words in a Sentence
        //   Input:
        //   Java is an Object Oriented Languag
        String str2 = sc.nextLine();
        int count = 1;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total Words = " + count);

        //reverse each word input java programming 
            String str3 = sc.nextLine();
            String word = "";
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) != ' ') {
                    word = str3.charAt(i) + word;
                } else {
                    System.out.print(word + " ");
                    word = "";
                }
            }
            System.out.print(word);

        //Student Result System
            // Input:
            // Name
            // 5 Subject Marks
            // Print:
            // Total
            // Average
            // Percentage
            // Grade
            // Pass/Fail
          
        String name;
        int marks[] = new int[5];
        int total = 0;
        double average, percentage;
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter 5 Subject Marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        average = total / 5.0;
        percentage = total / 5.0;
        System.out.println("\nName: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        if (percentage >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        
    //Sum of Even Numbers Between 1 and N
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}

    
