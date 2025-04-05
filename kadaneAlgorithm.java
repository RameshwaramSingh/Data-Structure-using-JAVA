public class KadaneAlgorithm {
    static int kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for(int i =0;i<arr.length;i++){
            currSum = currSum+arr[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum =0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,-6,5,8,6,5,-3};
        System.out.println(kadane(arr));
    }
}
