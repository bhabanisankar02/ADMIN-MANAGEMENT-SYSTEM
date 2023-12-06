public class QuickSort {
    void quickSort(int arr[], int low , int high){
        if(low<high){
            //find pivot element such that
            // elements smaller than pivot are on the left
            // and elements greater than pivot are on the right
            int pi = partition(arr,low,high);

            // recursively sort elements on the left of the pivot
            quickSort(arr, low, pi - 1);

            //recursively sort elements on the right of the pivot
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        
        //choose the rightmost element as pivot
        int pivot = arr[high];
        //pointer for greater element
        int i = (low-1);

        //traverse through all elements 
        // compare each element with pivot
        for(int j=low;j<=high-1;j++){
        
            if(arr[j] < pivot){// In this condition you can change the order of the resultant array.
                //swap arr[i+1] and arr[j]
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //Swap the pivot element with the greatest element specified by i
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        //return the position from where partition is done
        return (i + 1);
        
    }

    public static void main(String args[]){
        int array[]={50,23,98,46,76};
        System.out.println("Original Array" );

        int n = array.length;

        QuickSort ob = new QuickSort();
        ob.quickSort(array, 0, n - 1);

        System.out.println("sorted array");
        printArray(array);

    }

    private static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
