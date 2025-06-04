package com.priyanshu.array;

public class ConsecutiveOne {public static void main(String[] args) {
    int arr[] = {1,0,0,1,1,1,0,1,0,1};
    System.out.println(consecutiveOne(arr));
}
    static int consecutiveOne(int arr[]){
        int maxCount =0;
        for(int i =0; i<arr.length;i++){
            int count =0;
            {
                for (int j=i;j<arr.length;j++){
                    if(arr[j]==1){
                        count++;
                    }
                    if(maxCount<count){
                        maxCount = count;
                    }
                    if(arr[j]==0){
                        break;
                    }
                }
            }
        }
        return maxCount;
    }
}
