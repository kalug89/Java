import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     /*1
     Add two Numbers
     */

//        int firstNumber = 1;
//        int secondNumber = 2;
//
//        int sum = firstNumber + secondNumber;
//
//        System.out.println(firstNumber + secondNumber);
//        System.out.println(sum);

     /*
     2 Add two Numbers with input number
     */

//        System.out.println("Add two number. Please give me first:");
//        Scanner scannerFirstNumber = new Scanner(System.in);
//        int firstNum = scannerFirstNumber.nextInt();
//
//        System.out.println("and second");
//        Scanner scannerSecondNumber = new Scanner(System.in);
//        int secondNum = scannerSecondNumber.nextInt();
//
//        int scannerSum = firstNum + secondNum;
//        System.out.println("Sum is: " + scannerSum);

      /*
     2 program - check Even or Odd number
     */

        //Check number from array

        int[] table = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i : table) {
            if (i % 2 == 0) {
                System.out.println("Liczba " + i + " jest parzysta");
            } else {
                System.out.println("Liczba " + i + " jest nieparzysta");
            }
        }

        //Check number from input terminal

        Scanner numberObj = new Scanner(System.in);
        System.out.println("Please write integer number");

        int number = numberObj.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is odd");
        } else {
            System.out.println("Number " + number + " is even");
        }
    }
}
