public class seclarge {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        int secondLargest = findSecondLargest(array);
        
        System.out.println("Second largest element: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}
