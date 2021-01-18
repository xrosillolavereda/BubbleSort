/*
 * AÑADO ESTA lÍNEA !!!
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author XRosillo
 */
public class BubbleSort {

    /* This the bubbleSort algorithm wrote by a junior developer whose had no care about debugging and testing */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        int num_iter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                num_iter++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    print(a);
                }
            }
        }
        System.out.println("Num iterations: " + num_iter);
    }


    private static void swap(int a[], int pos1, int pos2) {
        int tmp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = tmp;
    }

    private static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int array[] = {7, 5, 1, 2, 3, 6, 4};
        System.out.print("Unsorted Array: ");
        print(array);

        bubbleSort(array);
        System.out.print("Final Output Bubble Sort: ");
        print(array);

        
        array = new int[]{17, 5, 7, 11, 13, 2, 3, 1, 19};
        System.out.print("Unsorted Array: ");
        print(array);
        
        bubbleSort(array);
        System.out.print("Final Output Bubble Sort: ");
        print(array);
    }
}
