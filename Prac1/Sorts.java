/** 
** Software Technology 152
** Class to hold various static sort methods.
*/
class Sorts
{
    // bubble sort
    public static void bubbleSort(int[] A)
    {
      int n = A.length;
      boolean swapped;

      for (int i = 0; i < n; i++) {
          swapped = false;

          for (int j = i + 1; j < n; j++) {
              if (A[j] < A[i]) {
                  // Swap elements
                  int temp = A[i];
                  A[i] = A[j];
                  A[j] = temp;

                  swapped = true;
              }
          }

          // If no swaps are made in a pass, the array is already sorted
          if (!swapped) {
              break;
          }
      }      
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A)
    {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            // minimum element in unsorted array
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }// selectionSort()

    // insertion sort
    public static void insertionSort(int[] A)
    {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            int temp = A[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead of their current position
            while (j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j = j -1;                
            }

            // Place the value at its correct position in the sorted part
            A[j + 1] = temp;
        }
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts class
