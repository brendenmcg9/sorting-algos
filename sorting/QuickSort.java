/*
 *  *  * Purpose: Data Structure and Algorithms Lab 10
 *   *   * Status: Complete
 *    *    * Last update: 11/20/15
 *     *     * Submitted:  11/20/15
 *      *      * Comment:
 *       *       * @author: James McGrath
 *        *        * @version: 1
 *         *         */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class QuickSort {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static int [] items;
        static Random rnd = new Random();
        public static void main(String[] args) throws NumberFormatException, IOException {
                System.out.print("Enter number of integers: ");
                int size = Integer.parseInt(reader.readLine());
                System.out.println(size);
                items = new int[size];
                
                for(int i = 0; i < size; i++) {
                	System.out.print("Enter in integer " + (i+1) + ": ");
                	items[i] = Integer.parseInt(reader.readLine());
                	System.out.println(items[i]);
                }
                
               System.out.println("Input Data:");
               for(int i = 0; i < items.length; i++)
            	   System.out.print(items[i] + " ");
               
               sort(0, items.length-1);
               System.out.println("");
               
               System.out.println("Sorted Data:");
               for(int i = 0; i < items.length; i++)
            	   System.out.print(items[i] + " ");
        }
        
        private static void sort(int lowerIndex, int higherIndex)
        {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = items[rnd.nextInt(items.length)];

        while (i <= j) {
            while (items[i] < pivot)
                i++;
            while (items[j] > pivot)
                j--;
            if (i <= j) {
                int temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            sort(lowerIndex, j);
        if (i < higherIndex)
            sort(i, higherIndex);
        }
}
