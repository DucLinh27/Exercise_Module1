package Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 2, 3};
        /*insertionSort(arr);*/
        display(arr);
    }

    static void display(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }


    //sap xep chen
    /*static void insertionSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int insertion = array[i];
            int j = i -1;
            for (;j>=0 && array[j] < insertion; j--) {
                array[j+1] = array[j];
            }
            array[j +1]= insertion;
        }
    }*/


    //sap xep noi bot
    /*static void bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i] > array[j + 1]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }

    }*/



    //sap xep chon
   /* static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;

                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }*/
}
