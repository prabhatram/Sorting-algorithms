public class SortingAlgorithms {
    public void bubbleSort(int[] arr){
        //boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            //swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            /* if (!swapped) {
                break;
            } */
        }


    }

    public  void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            // Find the index of the minimum element
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("i=" + i + " j=" + j + " array length" + arr.length);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("\n" + "minIndex=" + minIndex);
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
}
