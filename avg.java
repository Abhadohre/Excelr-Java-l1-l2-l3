public class avg {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        double average = calculateAverage(array);
        
        System.out.println("Average of elements: " + average);
    }
    
    public static double calculateAverage(int[] array) {
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        
        return (double) sum / array.length;
    }
}
