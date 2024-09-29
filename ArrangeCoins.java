package com.priyanshu;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long ans = 0;
        while(start<=end){
            long m = start+(end-start)/2;
            if(m*(m+1)/2 == n){
                ans = (int)m;
                break;
            }
            else if(m*(m+1)/2 > n){
                end = m-1;
            }
            else{
                start = m+1;
                ans = m;
            }
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        ArrangeCoins obj = new ArrangeCoins();
        obj.arrangeCoins(12);
    }
}
