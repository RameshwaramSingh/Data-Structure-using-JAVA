class Palindrome {
    public boolean isPalindrome(int x) {
        int n = x;
        int rem =0;
        int ans = 0;
        while(n>0){
            rem = n%10;
            ans = ans*10+rem;
            n=n/10;
        }
        if(ans == x){
            return true;
        }
        return false;
    }
}
