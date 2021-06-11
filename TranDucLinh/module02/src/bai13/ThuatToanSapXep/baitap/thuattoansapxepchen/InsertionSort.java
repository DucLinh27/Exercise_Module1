package bai13.ThuatToanSapXep.baitap.thuattoansapxepchen;

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


    static void insertionSort(int [] list){
        for (int i = 1; i < list.length; i++) {
            int insertion = list[i];
            int j = i -1;
            for (;j>=0 && list[j] > insertion; j--) {
                list[j+1] = list[j];
            }
            list[j +1]= insertion;
        }
    }
}
