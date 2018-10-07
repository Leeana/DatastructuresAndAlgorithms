package Algorithms.Sorting;

public class InsertionSort {
    public InsertionSort(){}

    public <T extends Comparable<T>> void sort(T[] arr){
        if(arr == null || arr.length < 2){ return;}

        for (int i = 1; i < arr.length; i++) {
            int j = i-1;

            T temp = arr[i];
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j+1] = temp;
        }
    }

    public <T> void printArr(T[] arr){
        if(arr == null){ return;}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
