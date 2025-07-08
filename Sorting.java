

public class Sorting{
    public static void main(String[] args) {

        int[] Array = {13, 46, 24, 52, 20, 9};

        insertionSort(Array);
        
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
        int j;
        for(int i=0; i<arr.length; i++){
            j = i;
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
}