import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);






        System.out.print("Choose a task(defence task = 11: ");
        int whatProblem = sc.nextInt();

        if (whatProblem == 1) { // 1 problem

            System.out.print("Enter length of an array:");

            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = problem1.findMin(arr);
            System.out.println("Minimum element: " + min);
        }
        else if (whatProblem == 2) { // 2 problem

            System.out.print("Enter length of an array:");

            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            double avg = problem2.findAvg(arr);
            System.out.println("Average value: " + avg);
        }
        else if (whatProblem == 3) { // 3 problem

            System.out.print("Enter number: ");

            int n = sc.nextInt();

            if (problem3.findPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        }
        else if (whatProblem == 4) { // 4 problem

            System.out.print("Enter number: ");

            int n = sc.nextInt();

            System.out.println("Factorial of number" + problem4.factorialOfNumber(n));
        }
        else if (whatProblem == 5){ // 5 problem

            System.out.print("Enter number: ");

            int n = sc.nextInt();

            System.out.println(n + "-th element of fibocci: " + problem5.findElementOfFibonacci(n));
        }
        else if (whatProblem == 6){ // 6 problem
            System.out.print("Enter number: ");
            int a = sc.nextInt();
            System.out.print("Enter number to a power: ");
            int n = sc.nextInt();
            System.out.println(a + " to the power of " +  n + " is equal to: " + problem6.findExtended(a, n));
        }
        else if (whatProblem == 7){ // 7 problem

            System.out.print("Enter length of an array:");

            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            problem7.reversedArray(arr, 0, n - 1);

            System.out.println("Reversed array:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else if (whatProblem == 8){ // 8 problem

            System.out.print("Enter string to check for letters: ");

            sc.nextLine();

            String s = sc.nextLine();

            if(problem8.checkForLetters(s))
                System.out.println("no");
            else
                System.out.println("yes");
        }
        else if (whatProblem == 9){ // 9 problem

            System.out.print("Enter 2 number: ");

            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println("Binomial coefficient: " + problem9.binomialCoefficient(n, k));
        }
        else if (whatProblem == 10){ // problem

            System.out.print("Enter numbers for GCD(a, b): ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("GCD(" + a + ", " + b + "): " + problem10.GCD(a, b));
        }
        else if (whatProblem == 11){
            sc.nextLine();

            String s = sc.nextLine();

            if(defence.palindrom(s))
                System.out.println("palindrom");
            else
                System.out.println("no");

        } else{
            System.out.println("choose from 1 to 11");
        }
    }


}