import java.util.*;
public class RemoveConsecutiveString {
    static String removeConsecutiveCharacter(String s) {
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        while(r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                r++;
            }
            else if(s.charAt(l)!=s.charAt(r) || r == s.length()-1){
                sb.append(s.charAt(l));
                l = r;
                r++;
            }
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "geeks for geeks is best";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
