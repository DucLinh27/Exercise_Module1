package bai13.ThuatToanSapXep.baitap.minhhoaTTSX;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {1,5,6,7,2,3};
        insertionSort(arr);
        display(arr);
    }
    static void display(int [] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }


    static void insertionSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int insertion = array[i];
            int j = i -1;
            for (;j>=0 && array[j] < insertion; j--) {
                array[j+1] = array[j];
            }
            array[j +1]= insertion;
        }
    }
}
