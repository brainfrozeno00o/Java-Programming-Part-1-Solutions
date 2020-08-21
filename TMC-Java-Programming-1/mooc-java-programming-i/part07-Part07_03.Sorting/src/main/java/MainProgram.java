
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        if (array.length > 0) {
            int smallest = array[0];
            
            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
            
            return smallest;
        }
        return -1;
    }
    
    public static int indexOfSmallest(int[] array) {
        if (array.length > 0) {
            int smallest = array[0];
            int smallestIndex = 0;
            
            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    smallestIndex = i;
                }
            }
            
            return smallestIndex;            
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length > 0 && startIndex < table.length) {
            int smallest = table[startIndex];
            int smallestIndex = startIndex;
            
            for (int i = startIndex + 1; i < table.length; i++) {
                if (table[i] < smallest) {
                    smallest = table[i];
                    smallestIndex = i;
                }
            }
            
            return smallestIndex;            
        }
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int getSmallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, getSmallestIndex);
        }
    }

}
