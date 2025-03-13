/**
 * An example of implementing a recursive merge sort
 */

public class MergeSortExample
{
    public static void main(String [] args)
    {
        int [] list = {256, 7, 13, 22, 17, 2, 666, 42, 87, 10, 31, 12};
        int [] sorted;
        System.out.println("Unsorted: ");
        print(list);

        sorted = mergeSort(list);

        System.out.println("Sorted: ");
        print(sorted);

    }

    //recursive merge sort
    public static int [] mergeSort(int [] list)
    {
    }

    //merges the two lists together
    public static int [] merge(int [] left, int [] right)
    {
        int [] newList = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;  //index for full list

        //go through each list until one is fully added
        while(leftIndex < left.length && rightIndex < right.length)
        {
            if(left[leftIndex] < right[rightIndex])
            {
                newList[index] = left[leftIndex];
                leftIndex++;
            }
            else
            {
                newList[index] = right[rightIndex];
                rightIndex++;
            }

            index++;
        }

        //add the remaining elements in the incomplete list
        while(leftIndex < left.length)
        {
            newList[index] = left[leftIndex];
            index++;
            leftIndex++;
        }

        while(rightIndex < right.length)
        {
            newList[index] = right[rightIndex];
            index++;
            rightIndex++;
        }

        return newList;
    }

    //prints a list
    public static void print(int [] list)
    {
        for(int n : list)
        {
            System.out.print(n + ", ");
        }
        System.out.println("");
    }



}