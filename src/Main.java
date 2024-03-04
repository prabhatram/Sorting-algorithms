public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
        SortingAlgorithms sortAlgos = new SortingAlgorithms();

        sortAlgos.bubbleSort(arr); 
        //sortAlgos.selectionSort(arr);

        System.out.println("\n" + "Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
    
        }
    }
}
    
