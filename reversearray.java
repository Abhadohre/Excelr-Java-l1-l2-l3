import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        reverseArray(array);
        
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
