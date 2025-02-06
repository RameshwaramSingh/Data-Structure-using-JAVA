public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] ={4,2,0,3,2,5};
        System.out.println(trapping(arr));
    }
    static int trapping(int arr[]){
        int ans =0;
        int min ;
        int lmax[] = new int[arr.length];
        int rmax[] = new int[arr.length];
        lmax[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>lmax[i-1]){
                lmax[i] = arr[i];
            }
            else{
                lmax[i] = lmax[i-1];
            }
        }
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i =arr.length-2;i>=0;i--){
            if(arr[i]>rmax[i+1]){
                rmax[i] = arr[i];
            }
            else{
                rmax[i] = rmax[i+1];
            }
        }
        for(int i =0;i<arr.length-1;i++){
            if(lmax[i]>rmax[i]){
                min = rmax[i];
            }else{
                min = lmax[i];
            }
            ans = (ans+min)-arr[i];
        }
        return ans;
    }
}
