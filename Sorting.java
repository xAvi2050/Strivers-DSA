import java.util.*;

public class Sorting{
    public static void main(String[] args) {

        int[] Array = {13, 46, 24, 9, 52, 20, 9};

        mergeSort(Array, 0, Array.length - 1);

        for(int i=0; i<Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(arr[i]>arr[minIndex]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            } 
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }

        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
        }
    }
    
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
           int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
        }
    }

    static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = low + (high - low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}