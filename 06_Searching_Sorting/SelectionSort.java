/**
 * A quick programming example that shows the selection sort at work
 * @author YOUR NAME HERE
 */

 public class SelectionSort
 {
     public static void main(String [] args)
     {
         //create a new set of data and initialize
        int [] data = new int[20];  
        for(int i = 0; i<data.length; i++)
            data[i] = (int)(Math.random() * 100 + 1);
        
        //print out the unsorted list
        System.out.println("Unsorted list: ");
        print(data);

        //perform sort and print
        sort(data);
        System.out.println("Sorted list: ");
        print(data);

        System.out.println("Program ended normally");
     }

     /**
      * prints a list
      * @param list
      */

     public static void print(int [] list)
     {
        for(int i = 0; i<list.length - 1; i++)
            System.out.print(list[i] + ", ");
        
        System.out.println(list[list.length-1]);
     }

    /**
     * Sorting method that uses the in-place selection sort method
     * @param data list to be sorted
     */

     public static void sort(int [] data)
     {
        //loop through the list
        for(int i = 0; i < data.length - 1; i++)
        {
            int minPos = i;  //assume that the current element is the smallest; 

            //loop through the remaining list and find out if the current element is
            //the smallest element in the list; if not, swap
            for(int j = i + 1; j < data.length; j++)
            {
                //check which one is smallest
                if(data[j] < data[minPos])
                {
                    minPos = j;
                }
            }

            //swap
            if(i != minPos)
            {
                int temp = data[i];
                data[i] = data[minPos];
                data[minPos] = temp;
            }

        }
     }
 }