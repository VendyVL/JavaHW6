package Sem6;

import java.util.ArrayDeque;

// *2. Реализовать структуру данных "Очередь" на основе массива
// 2.1 Нужно сделать операцию "Добавить в очередь"
// 2.2 Нужно сделать операцию "Извлечь из очереди"
// 
// Суть задания не ясна.
// Очередь использовалась в волновом алгоритме. Насколько я понимаю, в ней главное добавлять в конец, а брать из начала.
// И что значит на основе массива? Двухмерная очередь?

public class Queue {
    public static int[][] quOne(int arr1[][], int a, int b) {
        /*Двумерный массив это же список списков? То есть можно создать очередь координат, например.
         * (1, 1)
         * (1, 2)
         * (2, 0)
         */
        // int [][] arr1 = {{1,1}, {1,2},{2,0}}; /*Если я захочу добавить четвёртый элемент оно же мне скажет, что вышло за пределы массива? */
        int [][] arr2 = new int [arr1.length+1][arr1[0].length];
        for (int i=0; i<arr1.length; ++i){
            for (int j=0; j<arr1[0].length; ++j){
                arr2[i][j]=arr1[i][j];
            }
        }
        arr2[arr1.length][0] = a;
        arr2[arr1.length][1] = b;

        return arr2;
    }
    /*при извлечении тогда тоже пересоздаём массив */
    public static int[][] quTwo(int arr[][]) {
        int a = arr[0][0];
        int b = arr[0][1];
        int [][] arr2 = new int [arr.length-1][arr[0].length];
        for (int i=1; i<arr.length; ++i){
            for (int j=0; j<arr[0].length; ++j){
                arr2[i][j]=arr[i][j];
            }
        }
        System.out.println(a);
        System.out.println(b);
        return arr2;
    }/*Какая-то чушь получилась... */

        static void printArray(int arr[][]){
            for (int i=0; i<arr.length; ++i){
                for (int j=0; j<arr[0].length; ++j){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(); 
            }
        }

        public static void main(String args[])
        {
            int [][] arr1 = {{1,1}, {1,2},{2,0}};
            int[][] arr = quOne(arr1, 2,5);      
            printArray(arr);

        }
}
