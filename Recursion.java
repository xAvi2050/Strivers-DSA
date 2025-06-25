// public class Recursion {
//     public static void main(String[] args) {
//         printNum(1);
//     }
//     static void printNum(int n){
//         if(n>10) return;
//         System.out.println(n);
//         printNum(n+1);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         printName("Jarvis", 1);
//     }
//     static void printName(String name, int n){
//         if(n>5) return;
//         System.out.println(name);
//         printName(name, n+1);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         printNum(5);
//     }
//     static void printNum(int n){
//         if(n<=0) return;
//         System.out.println(n);
//         printNum(n-1);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         printSum(1, 0);
//     }
//     static void printSum(int n, int sum){
//         if(n>7) {
//             System.out.println(sum);
//             return;
//         }
//         printSum(n+1, n+sum);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         factorial(5, 1);
//     }
//     static void factorial(int n, int mul){
//         if(n==0){
//             System.out.println(mul);
//             return;
//         }
//         factorial(n-1, n*mul);
//     }
// }

// public class Recursion {   // Reverse an Array without recursion
//     public static void main(String[] args) {
//         int[] arr = {2, 7, 4, 5, 3, 11};
//         int s = 0, e = arr.length-1;

//         while(s<=e){
//             int temp = arr[s];
//             arr[s] = arr[e];
//             arr[e] = temp;
//             s++; e--;
//         }

//         for(int i=0; i<=arr.length-1; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         int[] arr = {2, 7, 4, 5, 3, 11};
//         revArr(arr, 0, arr.length-1);
//     }
//     static void revArr(int[] arr, int s, int e){
//         if (s > e) {
//             for(int i = 0; i<arr.length; i++){
//                 System.out.print(arr[i] + " ");
//             }
//             return;
//         }
//         int temp = arr[s];
//         arr[s] = arr[e];
//         arr[e] = temp;
//         revArr(arr, s+1, e-1);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         String name = "Avijit";
//         revName(name, name.length() - 1);
        
//     }
//     static void revName(String str, int idx){
//         if(idx < 0) {
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         revName(str, idx-1);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         String name = "BoB";
//         boolean result = isPalindrome(name, 0, name.length() - 1);
//         System.out.println(result ? "Palindrome": "Non-Palindrome");
        
//     }
//     static boolean isPalindrome(String str, int s, int e){
//         if(s>=e) return true;
//         if(str.charAt(s) != str.charAt(e)) return false;
//         return isPalindrome(str, s+1, e-1);
//     }
// }

// public class Recursion {  // Fibonaci Series without recursion
//     public static void main(String[] args) {
//         int n = 8;
//         int a = 1;
//         int b = 1;
//         System.out.print(a + " " + b + " ");
//         for(int i = 3; i <= n; i++){
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }
//     }
// }

// public class Recursion { 
//     public static void main(String[] args) {
//         int n = 8;
//         System.out.print("1 1 ");
//         fibS(1, 1, n-2);
//     }

//     static void fibS(int a, int b, int remaining){
//         if(remaining == 0) return;
//         int c = a + b;
//         System.out.print(c + " ");
//         fibS(b, c, remaining - 1);
//     }
// }