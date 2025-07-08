

public class Test {
    public static void main(String[] args) {

        int[] arr = {24, 13, 46, 24, 52, 20, 9};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - i -1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}