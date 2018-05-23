/*  * Purpose: Data Structure and Algorithms Lab 9
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

public class SelectionSort {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static int [] items;
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
               
               sort(items);
               System.out.println("");
               
               System.out.println("Sorted Data:");
               for(int i = 0; i < items.length; i++)
            	   System.out.print(items[i] + " ");
        }
        
        private static void sort(int [] ar)
        {
        	int comparisons = 0;
        	int swaps = 0;
        	for(int i = 0; i < ar.length-1; i++)
        	{
        		int first = i;
        		for(int j = i+1; j < ar.length-1; j++)
        			if(ar[j] < ar[first]) {
        				first = j;
        				comparisons++;
        			}
        		int temp = ar[first];
        		ar[first] = ar[i];
        		ar[i] = temp;
        		swaps++;
        	}
        	System.out.println("\nNumber of comparisons: " + comparisons + "\nNumber of swaps: " + swaps);
       }
}
