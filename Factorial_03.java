package com.priyanshu;
import java.util.*;
public class Factorial_03 {
    static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of");
        int num = sc.nextInt();
        int fact = 1;
        for(int i =1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("factorial of number "+fact);
    }

    //factorial using recursion
    static int recFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*recFactorial(n-1);
    }
    public static void main (String[] args){
        //factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fac = recFactorial(n);
        System.out.println("Factorial of the number = "+fac);
    }
}
