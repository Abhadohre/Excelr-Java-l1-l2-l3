public class sumofarray {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        int sum = calculateSum(array);
        
        System.out.println("Sum of elements: " + sum);
    }
    
    public static int calculateSum(int[] array) {
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        
        return sum;
    }
}
