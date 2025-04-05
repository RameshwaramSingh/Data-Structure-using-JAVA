package com.priyanshu.array;

public class EvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5, 7, 9};
        System.out.println(maximumEvenOdd(arr));
    }
    static int maximumEvenOdd(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            int currMax =1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j-1]%2==0 && arr[j]%2!=0 || arr[j-1]%2!=0 && arr[j]%2==0){
                    currMax++;
                }
                if(currMax>max){
                    max = currMax;
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}
