import java.util.Arrays;

// leetcode ques no 31

public class NextPermutation {
    static void nextPermutation(int[] arr) {

        // this is used to find the pivot of the array
        int pivot = -1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }

        //if no pivot is found then reverse the array and return
        if(pivot == -1){
            int s = 0;
            int e = n-1;
            while(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
            return;
        }

        // swap the last element and pivot elemnt
        for(int i =n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }

        // reverse the remaining array after the pivot element
        int j = pivot+1;
        int k = n-1;
        while(j<=k){
            swap(arr,j,k);
            j++;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,5};
        nextPermutation(arr);
    }
}
