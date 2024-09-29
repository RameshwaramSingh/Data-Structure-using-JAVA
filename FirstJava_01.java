package com.priyanshu;

import java.util.Scanner;

public class FirstJava_01 {
    Scanner sc = new Scanner(System.in);

    //program to check even or odd number
    public void evenOrOdd(){
        System.out.println("Enter the number you want to check even or odd");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even");
        }
        if(num % 2 != 0){
            System.out.println(num+" is odd");
        }
        else{
            System.out.println("enter the correct number");
        }
    }

    // Program to find the simple interest

    public void simpleInterest(){
        float p,t,r;
        System.out.println("Enter the principal amount ");
        p = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        r = sc.nextFloat();
        System.out.println("Enter the time");
        t = sc.nextFloat();
        double si = p*r*t/100;
        System.out.println("Simple interest of the amount is "+si);
    }

    // fibonacci series program

    public void fibonacci(){
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i<num; i++){
            System.out.print(num1+ " ");
           int num3 = num1 +num2;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String args[]){
        FirstJava_01 obj = new FirstJava_01();
        obj.fibonacci();
    }
}
