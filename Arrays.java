import java.util.*;

public class Arrays {

    // 1) Largest Element in an Array

    // public static void main(String[] args){
    //     int[] arr = {2, 4, 99, 5, 2, 77, 99, 6, 100};

    //     int largest = arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         if(arr[i]>largest){
    //             largest = arr[i];
    //         }
    //     }
    //     System.out.println(largest);
    // }

    // 2) Second Largest Element in an Array

    // public static void main(String[] args){
    //     int[] arr = {2, 4, 99, 88, 5, 2, 77, 99, 6, 100};

    //     int L = -1, sL = -1;

    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]>L){
    //             sL = L;
    //             L = arr[i];
    //         }
    //         if(sL < L && L>arr[i]){
    //             sL = L;
    //         }
    //     }

    //     System.out.println(sL);
    // }

    // 3) Check if an Array is Sorted

    // public static void main(String[] args) {
    //     int[] arr = {1, 1, 2, 3, 4, 4, 4, 8};

    //     boolean answer = isSorted(arr);
    //     System.out.println(answer);
    // }

    // static boolean isSorted(int[] arr){
    //     for(int i=1; i<arr.length; i++){
    //         if(arr[i]<arr[i-1]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // 4) Remove Duplicates in-place from Sorted Array

    // public static void main(String[] args) {
    //     int[] arr = {2, 3, 4, 4, 5, 6, 6, 6};

    //     int i=0;
    //     for(int j=1; j<arr.length; j++){
    //         if(arr[i] != arr[j]){
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }

    //     for(int k = 0; k<= i; k++){
    //         System.out.print(arr[k] + " ");
    //     }
    // }

    // 5) Left rotation by one place

    // public static void main(String[] args) {
    //     int[] arr = {2, 6, 3, 8, 4, 1};

    //     int temp = arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         arr[i-1] = arr[i];
    //     }
    //     arr[arr.length-1] = temp;

    //     for(int j=0; j<arr.length; j++){
    //         System.out.print(arr[j] + " ");
    //     }
    // }

    // 6) Left rotation by D place

    // Brute-force approach
    // public static void main(String[] args) {
    //     int[] arr = {2, 6, 3, 8, 4, 1};
    //     int D = 2;
    //     int n = arr.length; 

    //     D = D%n;
    //     int[] temp = new int[D];

    //     for(int i=0; i<D; i++){
    //         temp[i] = arr[i];
    //     }

    //     for(int j=D; j<arr.length; j++){
    //         arr[j-D] = arr[j];
    //     }
        
    //     for(int k=0; k<D; k++){
    //         arr[n - D + k] = temp[k];
    //     }

    //     for(int x = 0; x<arr.length; x++){
    //         System.out.print(arr[x] + " ");
    //     }
    // }

    // Optimal approach
    // public static void main(String[] args) {
    //     int[] arr = {2, 3, 8, 10, 12};
    //     int D = 2;
    //     D=D%arr.length;

    //     reverse(arr, 0, arr.length - 1);
    //     reverse(arr, 0, D);
    //     reverse(arr, D+1, arr.length - 1);

    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // static void reverse(int[] arr, int s, int e){
    //     while(s<=e){
    //         int temp = arr[s];
    //         arr[s] = arr[e];
    //         arr[e] = temp;
    //         s++; e--;
    //     }
    // }

    // 7) Move all Zeros to the end of the array

    // Brute-force approach
    // public static void main(String[] args) {
    //     int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};

    //     int[] newArr = new int[arr.length];

    //     int j = 0;

    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] != 0){
    //             newArr[j] = arr[i];
    //             j++;
    //         }
    //     }

    //     for(int k = 0; k<arr.length; k++){
    //         System.out.print(newArr[k] + " ");
    //     }
    // }

    // Optimal approach
    // public static void main(String[] args) {
    //     int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};

    //     int j=-1;

    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] == 0){
    //             j = i;
    //             break;
    //         }
    //     }

    //     for(int i=j+1; i<arr.length; i++){ 
    //         if(arr[i] != 0){
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp; 
    //             j++;
    //         }
    //     }

    //     for(int k = 0; k<arr.length; k++){
    //         System.out.print(arr[k] + " ");
    //     }
    // }

    // 8) Linear Search

    // public static void main(String[] args) {
    //     int[] arr = {3, 4, 7, 8, 2, 3, 6};
    //     int key = 7;

        
    //     boolean found = false;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] == key){
    //             System.out.println(i);
    //             found = true;
    //             break;
    //         }
    //     }

    //     if(!found){
    //         System.out.println("-1");
    //     }
    // }

    // 9) Missing Number

    // Brute-force approach
    // public static void main(String[] args) {
    
    //     int[] arr = {1, 2, 3, 5};

    //     int flag = 1;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] != flag){
    //             System.out.println(flag);
    //             break;
    //         }
    //         flag++;
    //     }
    // }

    // Optimal Approach
    // public static void main(String[] args) {
    //     int N = 5;
    //     int[] arr = {1, 2, 3, 4};

    //     int realSum = N * (N + 1) / 2;

    //     int acutalSum = 0;

    //     for(int i: arr){
    //         acutalSum += i;
    //     }

    //     System.out.println(realSum - acutalSum);
    // }

    // 10) Find the number that appears once, and the other numbers twice

    // Brute-force approach
    // public static void main(String[] args) {
    //     int[] arr = {2, 3, 3, 2, 7, 8, 9, 7, 8, 11};

    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int i=0; i<arr.length; i++){
    //         if(map.containsKey(arr[i])){
    //             map.put(arr[i], map.get(arr[i]) + 1);
    //         }else{
    //             map.put(arr[i], 1);
    //         }
    //     }

    //     for(int j: map.keySet()){
    //         if(map.get(j) == 1){
    //             System.out.println(j);
    //         }
    //     }
    // }

    // Optimal Approach using XOR

    // a ^ a = 0, 0 ^ a = a;

    // public static void main(String[] args) {
    //     int[] arr = {2, 3, 3, 2, 7, 8, 7, 8};

    //     int xor = 0;

    //     for(int i=0; i<arr.length; i++){
    //         xor = xor ^ arr[i];
    //     }

    //     System.out.println(xor);
    // }

    // 11) Print the length of the subarray with given sum k
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 9};
        int k = 13;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == k){
                    System.out.print(j - i + 1);
                    return;
                }
            }
        }
    }
}