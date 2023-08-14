public class evenodd {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        
        int[] evenArray = separateEvenOdd(array);
        
        System.out.println("Even numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nOdd numbers:");
        for (int num : array) {
            if (!contains(evenArray, num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    public static int[] separateEvenOdd(int[] array) {
        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        
        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }
        
        return evenArray;
    }
    
    public static boolean contains(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
