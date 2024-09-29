package com.priyanshu;
import java.util.*;

// print the maximum and minimum number
public class MaxNum_03 {
    Scanner sc = new Scanner(System.in);
    static void method_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one");
        int num1 = sc.nextInt();
        System.out.println("Enter the number two");
        int num2 = sc.nextInt();
        System.out.println("Enter the number three");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is greater number among three number");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println(num2+" is greater number among three number");
        }
        else if (num3>num1 && num3>num2) {
            System.out.println(num3+" is greater number among three number");
        }
        if(num1<num2 && num1<num3){
            System.out.println(num1+" is smallest number among three number");
        }
        else if(num2<num3 && num2<num1){
            System.out.println(num2+" is smallest number among three number");
        }
        else if(num3<num2 && num3<num1){
            System.out.println(num3+" is smallest number among three number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one");
        int num1 = sc.nextInt();
        System.out.println("Enter the number two");
        int num2 = sc.nextInt();
        System.out.println("Enter the number three");
        int num3 = sc.nextInt();
        //method_1();
        int largest = largest( num1, num2, num3);
        int smallest = smallest(num1,num2,num3);
        System.out.printf("largest among three number %d,%d and %d is : %d %n",num1,num2,num3,largest);
        System.out.printf("smallest among three number %d,%d and %d is : %d %n",num1,num2,num3,smallest);
    }
        public static int largest(int num1,int num2,int num3){
            int max = num1;
            if(num2>max){
                max = num2;
            }
            if(num3> max){
                max = num3;
            }
            return max;
        }
       public static int smallest(int num1,int num2,int num3){
           int min = num1;
           if(num2<min){
               min = num2;
           }
           if(num3< min){
               min = num3;
           }
           return min;
       }
}
