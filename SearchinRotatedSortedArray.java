public class SearchinRotatedSortedArray {
    static int search(int[] arr, int target) {
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            //if the element lie in left half
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && arr[mid]>=target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

            // if the element lie in right half
            else{
                if(arr[mid]<=target && target<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,3};
        System.out.println(search(arr,3));
    }
}
