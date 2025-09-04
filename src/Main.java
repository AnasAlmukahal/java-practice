import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println(A2.longest("abcabcbb"));

    }
}
class A2{
    public static int longest(String l){
        int s = l.length();
        int maxLen = 0;
        for(int i = 0; i < s; i++){
            for(int j = i; j< s; j++){
                if(Allunique(l,i,j)){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }


public static boolean Allunique(String l, int i, int j){
    Set<Character> seen = new HashSet<>();
    for(int k = i; k <= j; k++) {
        char c = l.charAt(k);
        if (seen.contains(c)) {
            return false;
        }
        seen.add(c);


    } return true;

}}