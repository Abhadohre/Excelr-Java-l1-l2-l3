import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        int target = 8; 
        
        int[] newArray = deleteInteger(array, target);
        
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after deleting " + target + ": " + Arrays.toString(newArray));
    }
    
    public static int[] deleteInteger(int[] array, int target) {
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        
        for (int num : array) {
            if (num != target) {
                newArray[newIndex] = num;
                newIndex++;
            }
        }
        
        return newArray;
    }
}
