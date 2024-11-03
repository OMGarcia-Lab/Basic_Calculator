import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Quick Basic Calculator");

        // These are the Options //
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
        System.out.print("Please enter the operation that you would like to use: ");
        String operation = input.nextLine();

        System.out.println();

        if (operation.equals("5")) {
            System.out.println("Thank you for using our Calculator... \nGoodbye!");
            return;
        }

       // Ask the user to put in their 2 numbers //
        System.out.print("Please input the first number: ");
        double firstNum = input.nextDouble();
        System.out.print("Please input the second number: ");
        double secondNum = input.nextDouble();

        // Define the variable before making the if statements //
        double answer;
        if(operation.equals("1")) {
            answer = firstNum + secondNum;
            System.out.println("Answer: " + answer);
        }else if(operation.equals("2")) {
            answer = firstNum - secondNum;
            System.out.println("Answer: " + answer);
        } else if(operation.equals("3")) {
            answer = firstNum * secondNum;
            System.out.println("Answer: " + answer);
        } else if(operation.equals("4")) {
            if(secondNum == 1) {
                System.out.println("Cannot divide by 0");
            } else {
                answer = firstNum / secondNum;
                System.out.println("Answer: " + answer);
            }
        } else {
            System.out.println("Invalid Operation");
        }
    }
}