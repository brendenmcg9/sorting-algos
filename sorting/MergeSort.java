/*  * Purpose: Data Structure and Algorithms Lab 10
 *   *   * Status: Complete
 *    *    * Last update: 11/16/15
 *     *     * Submitted:  11/16/15
 *      *      * Comment:
 *       *       * @author: James McGrath
 *        *        * @version: 1
 *         *         */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MergeSort {

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
               
               mergeSort(items);
               System.out.println("");
               
               System.out.println("Sorted Data:");
               for(int i = 0; i < items.length; i++)
            	   System.out.print(items[i] + " ");
        }
        
        public static void mergeSort(int[] array) {
    		if(array.length < 2) {
    			return;
    		}
    		int count = 1;
    		int firstL, firstR;
    		while(count < array.length) {
    			firstL = 0;
    			firstR = count;
    			while(firstR + count <= array.length) {
    				mergeArrays(array, firstL, firstL + count, firstR, firstR + count);
    				firstL = firstR + count;
    				firstR = firstL + count;
    			}
    			if(firstR < array.length) {
    				mergeArrays(array, firstL, firstL + count, firstR, array.length);
    			}
    			count = count*2;
    		}
    	}
    	public static void mergeArrays(int[] array, int firstL, int lastL,
    		int firstR, int lastR) {
    		int[] right = new int[lastR - firstR + 1];
    		int[] left = new int[lastL - firstL + 1];

    		for(int i = 0, k = firstR; i < (right.length - 1); ++i, ++k) {
    			right[i] = array[k];
    		}
    		for(int i = 0, k = firstL; i < (left.length - 1); ++i, ++k) {
    			left[i] = array[k];
    		}
    		right[right.length-1] = Integer.MAX_VALUE;
    		left[left.length-1] = Integer.MAX_VALUE;
    		for(int k = firstL, m = 0, n = 0; k < lastR; ++k) {
    			if(left[m] <= right[n]) {
    				array[k] = left[m];
    				m++;
    			}
    			else {
    				array[k] = right[n];
    				n++;
    			}
    		}
    	}
}
