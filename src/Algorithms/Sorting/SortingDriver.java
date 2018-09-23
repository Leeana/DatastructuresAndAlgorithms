package Algorithms.Sorting;

public class SortingDriver {
    public static void main(String[] args) {
        //*
        Integer[] integerArr = {6, 20, 10, 9, 1, 24, 14, 5};
        String[] stringArr = {"s", "f", "d", "l", "y", "q", "a", "m"};
        Integer[] emptyArr = {};
        String[] oneObjArr = {"r"};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integerArr);
        bubbleSort.printArr(integerArr);

        System.out.println();
        bubbleSort.sort(stringArr);
        bubbleSort.printArr(stringArr);

        System.out.println();
        bubbleSort.sort(emptyArr);
        bubbleSort.printArr(emptyArr);

        System.out.println();
        bubbleSort.sort(oneObjArr);
        bubbleSort.printArr(oneObjArr);
        //*/
    }
}
