package JavaCodesSagar;

import java.util.Scanner;

public class JavaNumberPrograms {
    public static void main(String[] args) {

        evenOddNumber();
        swapTwoNumbers();
        printEvenOddNumber();
        factorialOfNumber();
        PrimeNumber();
        leafYear();
        armstrongNumber();
        fibinacciIterative();
        lagestNumberWithoutIfElse();
        multiplicationTable();
        reverseNumberWithStringBuffer();
        reverseNumberWithStringBuilder();
        averageOfArray();


    }

    //Program to check Even Odd number
    public static void evenOddNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }


    //Program for swapping of two numbers
    public static void swapTwoNumbers() {
        int a = 20;
        int b = 30;
        int c;

        System.out.println("Numbers Before swapping");
        System.out.println("a="+a+" "+"b="+b);

        c=a;
        a=b;
        b=c;
        System.out.println("Numbers after swapping");
        System.out.println("a="+a+" "+"b="+b);

        /*Without using third variable
        a=a+b;
        b=a-b;
        a=a-b;*/

    }

    //Program to print Even odd numbers from 0 to 100
    public static void printEvenOddNumber(){
        System.out.println("Even numbers");
        for (int i=0; i<=100; i+=2){
            System.out.println(i);
        }
        System.out.println("Odd number");
        for (int i=1; i<=100; i+=2){
            System.out.println(i);
        }
    }
    //Program to find Even Odd number from given array
    public static void evenOddFromArray(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int num: arr)
        {
            if (num%2==0){
                System.out.println("Even Number:"+num+" ");
            }
            for (int num1: arr){
                if (num%2!=0)
                {
                    System.out.println("Odd Number"+num1+" ");
                }
            }
        }
    }

    //Program to find the factorial of given number
    public static void factorialOfNumber(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=scanner.nextInt();

        long factorial=1;
        for (int i = num; i>0; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

    //Program to check the prime number
    public static void PrimeNumber() {
        int num = 7;
        int temp = 0;
        for (int i = 2; i < 2; i++) {

            if (num % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp==0) {
            System.out.println("Given number is prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }
    }
    //Program to check leaf year
    public static void leafYear(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Year");
        int year=scanner.nextInt();

        if(year%4==0){
            System.out.println("Given Year is leaf year");
        }
        else {
            System.out.println("Given Year is not leaf year");
        }
    }
    //Program to check Armstrong number
    public static void armstrongNumber(){
        int x=153;
        int y=(1*1*1)+(5*5*5)+(3*3*3);
        System.out.println(y);
        if (x==y){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }

    //Program for Fibinacci Iterative
    public static void fibinacciIterative(){
        int count = 20;
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; ++i) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

//program for largest number without if else

    public static void lagestNumberWithoutIfElse(){
        int x=10;
        int y=20;
        int largestNumber= x>y?x:y;
        System.out.println(largestNumber);
    }

    //Program for multiplication table
    public static void multiplicationTable() {
        int number=7;
        int result;
        for (int i=1;i<=10;i++){
            result=number*i;
            System.out.print(result + " " );
        }
    }

    //Print number reverse using string builder
    public static void reverseNumberWithStringBuilder() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();

        StringBuilder stringBuilder=new StringBuilder(Integer.toString(num));
        stringBuilder.reverse();
        int revNum = Integer.parseInt(stringBuilder.toString());
        System.out.println("Reverse number is  " + revNum );
        //To check pallindrome number

        if (num==revNum){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }

    //Print number reverse using string builder
    public static void reverseNumberWithStringBuffer() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();

        StringBuffer stringBuffer=new StringBuffer(Integer.toString(num));
        stringBuffer.reverse();
        int revNum = Integer.parseInt(stringBuffer.toString());
        System.out.println("Reverse number is  " + revNum );

    }
    //Calculate average of array
    public static void averageOfArray() {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        double average = (double) sum / a.length;
        System.out.println(average);
    }
}

