package Main.java.com.company.excercise1;

import java.util.Scanner;

public class AppEx1 {

    public static final int FIRST_NUM_FIB = 0;
    public static final int SECOND_NUM_FIB = 1;

    public static byte userNumber;

    public static void main(String[] args) {

        firstMessage();

        FibonacciSequences fibSeq = new FibonacciSequences();
        long outputNumber = fibSeq.calculateSequenceNumber(FIRST_NUM_FIB, SECOND_NUM_FIB, userNumber);
        System.out.println("Your number is: " + outputNumber);

    }

    public static void firstMessage(){
        System.out.println("Hello! This is simple app where you can calculate n-number of Fibonacci Sequences");
        System.out.print("Please write your number: ");

        Scanner sc = new Scanner(System.in);
        userNumber = sc.nextByte();
    }
}
