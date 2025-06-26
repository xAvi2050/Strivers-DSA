// --> Counting the occurrance of each element inside of an integer array

// public class Hashing {
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 2, 7, 8, 8, 5, 4, 4, 6, 8};
//         int[] hash = new int[9]; 

//         for (int i = 0; i < arr.length; i++) {
//             hash[arr[i]]++;  
//         }

//         // Print frequencies of all numbers
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " --> " + hash[i] + " times");
//             }
//         }
//     }
// }

// --> Counting the occurrance of each character inside of a String

// public class Hashing {
//     public static void main(String[] args) {
//         String str = "abcdAbcfffg";
//         int[] hash = new int[256];

//         for(int i=0; i<str.length(); i++){
            
//             hash[str.charAt(i)]++;
//         }

//         for(int i=0; i<hash.length; i++){
//             if(hash[i]>0){
//                 System.out.println("Character " + (char)(i) + " --> " + hash[i] + " times");
//             }
//         }
//     }
// }

// --> Hash Map for counting elements in an array of numbers

// import java.util.HashMap;
// import java.util.Map;

// public class Hashing {
//     public static void main(String[] args) {
        
//         int[] arr = {2, 4, 2, 7, 6, 7, 8, 8, 5, 5, 4, 4, 6, 8};

//         Map<Integer, Integer> ele = new HashMap<>();

//         for (int num : arr) {
//             if(ele.containsKey(num)){
//                 ele.put(num, ele.get(num)+1);
//             }else{
//                 ele.put(num, 1);
//             }
//         }

//         int maxFreq = Integer.MIN_VALUE;
//         int minFreq = Integer.MAX_VALUE;
//         int mostFrequentElement = -1;
//         int leastFrequentElement = -1;

//         for (Map.Entry<Integer, Integer> entry : ele.entrySet()) {
//             int num = entry.getKey();
//             int freq = entry.getValue();

//             if (freq > maxFreq) {
//                 maxFreq = freq;
//                 mostFrequentElement = num;
//             }

//             if (freq < minFreq) {
//                 minFreq = freq;
//                 leastFrequentElement = num;
//             }
//         }

//         System.out.println("Most frequent --> " + mostFrequentElement + " (" + maxFreq + " times)");
//         System.out.println("Least frequent --> " + leastFrequentElement + " (" + minFreq + " time" + (minFreq > 1 ? "s" : "") + ")");
//     }
// }
