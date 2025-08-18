import java.util.*;

public class Strings {

    // 1) Reverse a string
    // public static void main(String[] args) {
    //     String str = "avijit";
    //     StringBuilder sb = new StringBuilder();
        
    //     int right = str.length() - 1;
        
    //     while (right >= 0) {
    //         char temp = str.charAt(right);
    //         sb.append(temp);
    //         right--;
    //     }

    //     System.out.println(sb.toString());
    // }

    // 2) Check if a string is a palindrome 
    // public static void main(String[] args) {
    //     String str = "bob";
        
    //     if(isPalindrome(str)) System.out.print("Palindrome");
    //     else System.out.print("Not a Palindrome");
    // }
    // public static boolean isPalindrome(String s){
    //     if(s.length() == 0) return false;
        
    //     int left = 0, right = s.length() - 1;
        
    //     while(left<=right){
    //         if(s.charAt(left) != s.charAt(right)) return false;
    //         left ++; right --;
    //     }
    //     return true;
    // }

    // 3) Largest Odd Number in a String
    // public static void main(String[] args) {
    //     String str = "001234789";    // 12347
        
    //     int end = str.length() - 1;
        
    //     while(end>=0){
    //         char ch = str.charAt(end);
    //         int num = ch - '0';
    //         if(num % 2 != 0){
    //             String result = str.substring(0, end + 1);
                
    //             result = result.replaceFirst("^0+", "");
    //             System.out.print(result);
    //             return;
    //         }
    //         end --;
    //     }
    //     System.out.print("");
    // }

    // 4) Longest Common Prefix

    // public static void main(String[] args) {
    //     String[] strs = {"flower", "flow", "flight"};
    //     String ans = commonPrefix(strs);
    //     System.out.println(ans);
    // }

    // static String common(String s1, String s2){
    //     StringBuilder sb = new StringBuilder();
    //     int n = Math.min(s1.length(), s2.length());

    //     for(int i=0; i<n; i++){
    //         if(s1.charAt(i) == s2.charAt(i)) {
    //             sb.append(s1.charAt(i));
    //         }else{
    //             break;
    //         }
    //     }
    //     return sb.toString();
    // }
    
    // static String commonPrefix(String[] strs){
    //     String result = strs[0];

    //     for(int j=1; j<strs.length; j++){
    //         result = common(result, strs[j]);
    //     }
    //     return result;
    // }

    // 5) Isomorphic String

    // public static void main(String[] args) {
    //     String s1 = "add";
    //     String s2 = "egg";

    //     if(isIsomorphic(s1, s2)) System.out.println("Isomorphic");
    //     else System.out.println("Fuckmorphic");
    // }

    // static boolean isIsomorphic(String s1, String s2) {
    //     if (s1.length() != s2.length()) return false;

    //     Map<Character, Character> map = new HashMap<>();
    //     Set<Character> used = new HashSet<>();

    //     for (int i = 0; i < s1.length(); i++) {
    //         char c1 = s1.charAt(i);
    //         char c2 = s2.charAt(i);

    //         if (map.containsKey(c1)) {
    //             // check if previously mapped char matches current
    //             if (map.get(c1) != c2) return false;
    //         } else {
    //             // ensure no two different chars map to same char
    //             if (used.contains(c2)) return false;
    //             map.put(c1, c2);
    //             used.add(c2);
    //         }
    //     }
    //     return true;
    // }

    // 6) Is Rotated String ??

    // Input : s = "abcde" , goal = "cdeab"
    // Output : true
    // Explanation : After performing 2 shifts we can achieve the goal string from string s.
    // After first shift the string s is => bcdea
    // After second shift the string s is => cdeab.

    // public static void main(String[] args) {
    //     String s = "abcde";
    //     String goal = "adeac";
    //     if(isRotation(s, goal)) System.out.println("True");
    //     else System.out.println("False");
    // }
    // static boolean isRotation(String s, String goal) {
    //     if (s.length() != goal.length()) return false;

    //     StringBuilder sb = new StringBuilder(s);

    //     for (int i = 0; i < s.length(); i++) {
    //         sb.append(sb.charAt(0));   // move first char to end
    //         sb.deleteCharAt(0);        // remove first char
    //         if (sb.toString().equals(goal)) return true;
    //     }
    //     return false;
    // }
}