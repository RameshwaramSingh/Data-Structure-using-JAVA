import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();
        anagram(s1,s2);
    }
    static void anagram(String s1, String s2){
        s1.toLowerCase();
        s2.toLowerCase();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        int c1sum =0;
        int c2sum =0;
        if(c1.length!=c2.length){
            System.out.println("String is not anagram because the length of the string is not equal");
        }else {
            for (int i = 0; i < c1.length; i++) {
                c1sum = c1sum + c1[i];
            } 
            for (int i = 0; i < c2.length; i++) {
                c2sum = c2sum + c2[i];
            }
            if(c1sum==c2sum){
                System.out.println("Both string are anagram");
            }
            else{
                System.out.println("String is not anagram");
            }
        }
    }
}
