package com.priyanshu.array;
/* boyer moore voting algorithm
 this algorithm used to find the majority element in the array
 majority element means one element which appear more than n/2 times size of the array
 */

public class boyer {
    public static void main(String[] args) {
        int arr[] = {8,3,8,7,8,5,8};
        System.out.println(findMajority(arr));
    }
    static int findMajority(int arr[]){
        int res =0, count =1;
        for(int i = 1;i<arr.length; i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count =1;
            }
        }  // this loop is used to find the element which occur most in the array

        count =0;
        for(int i =0; i<arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count<=arr.length/2){
            res = -1;
        }
        // this is used to check whether  the element is in majority or not
        return res;
    }
}

