// public class BasicMath {
//     public static void main(String[] args) {
//         int num = 243;
//         int count = 0;
//         while(num>0){
//             num/=10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int num = 4675;
//         int revNum = 0;

//         while(num>0){
//             revNum = (revNum * 10) + num % 10;
//             num/=10;
//         }
//         System.out.println(revNum);
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int n1 = 12;
//         int n2 = 18;

//         while(n2!=0){  // HCF using Euclidean algorithm
//             int temp = n2;
//             n2 = n1 % n2;
//             n1 = temp;
//         }
//         System.out.println(n1);
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int OriginalNum = 153;
//         int num = 153;
//         int sum = 0;
//         while(num>0){
//             int lastDigit = num % 10;
//             sum = sum + (lastDigit * lastDigit * lastDigit);
//             num/=10;
//         }
//         if(sum == OriginalNum){
//             System.out.println("Armstrong");
//         } else{
//             System.out.println("No");
//         }
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int n = 6;
//         int index = 0;
//         int[] arr = new int[n];
//         for(int i=1; i<=n; i++){
//             if(n%i == 0){
//                 arr[index] = i;
//                 index++;
//             }
//         }
//         for(int j = 0; j < index; j++){
//             System.out.print(arr[j] + " ");
//         }
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int num = 17;
//         boolean isPrime = true;
//         for(int i=2; i<num; i++){
//             if(num % i == 0){
//                 System.out.println("Non - Prime");
//                 isPrime = false;
//                 break;
//             }
//         }
//         if (isPrime) System.out.println("Prime");
//     }
// }

// public class BasicMath {
//     public static void main(String[] args) {
//         int limit = 100;
//         int sum = 0;
//         for(int i=1; i<limit; i++){
//             if(isPrime(i)){
//                 sum += i;
//             }
//         }
//         System.out.println(sum);
//     }
//     public static boolean isPrime(int num) {
//         if (num <= 1) return false;
//         for(int k=2; k<num; k++){
//             if(num % k == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }