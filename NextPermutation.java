https://leetcode.com/problems/next-permutation/
// leetcode ques no 31

class Solution {
    // Method to find the next lexicographically greater permutation in-place.
public void nextPermutation(int[] arr) {
    int pivot = -1;
    int n = arr.length;

    // 1. Find the **pivot** (index 'i'): the first element from the right 
    // that is smaller than its successor (arr[i] < arr[i+1]).
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            pivot = i;
            break;
        }
    }

    // CASE 1: Array is in descending order (largest permutation).
    if (pivot == -1) {
        // Reverse the entire array to get the lowest possible order (ascending).
        int s = 0;
        int e = n - 1;
        while (s < e) { 
            swap(arr, s, e);
            s++;
            e--;
        }
        return;
    }

    // 2. Find the smallest element to the right of 'pivot' that is > arr[pivot], and swap.
    // This ensures the smallest possible increase in the prefix.
    for (int i = n - 1; i > pivot; i--) {
        if (arr[i] > arr[pivot]) {
            swap(arr, i, pivot);
            break;
        }
    }

    // 3. Reverse the suffix (from pivot + 1 to the end).
    // This sorts the suffix to the smallest lexicographical order, completing the permutation.
    int j = pivot + 1;
    int k = n - 1;
    while (j < k) { 
        swap(arr, j, k);
        j++;
        k--;
    }
}
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
