package practice4.problem4;
public class Sort implements CountingSort {

    public void sort(int[] arr) {
        int[] count = new int[11]; 

        
        for (int num : arr) {
            count[num]++;
        }

        
        System.out.print("Sorted array: ");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}