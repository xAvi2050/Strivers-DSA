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
}