public class minmax {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        int min = findMin(array);
        int max = findMax(array);
        
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
    
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE; // Initialize to the largest possible value
        
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        
        return min;
    }
    
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE; // Initialize to the smallest possible value
        
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
}
