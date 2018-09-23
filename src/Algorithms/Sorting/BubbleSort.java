package Algorithms.Sorting;

public class BubbleSort{
    public BubbleSort(){}

    public <T extends Comparable<T>> void sort(T[] arr){
        if(arr == null || arr.length < 2){ return;}

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) > 0){
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public <T> void printArr(T[] arr){
        if(arr == null){ return;}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
