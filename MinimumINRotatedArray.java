public class MinimumInRotatedArray {
    static int findMin(int arr[]){
        int ans = Integer.MAX_VALUE;
        int s = 0, e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[s]<=arr[mid]){
                ans = Math.min(ans,arr[s]);
                s = mid+1;
            }
            else{
                e = mid-1;
                ans = Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
