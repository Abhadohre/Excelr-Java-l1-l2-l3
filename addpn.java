public class addpn{
    public static void main(String[] args) {
        int[] array = { -5, 2, -8, 10, -1, 6 };
        
        int positiveSum = 0;
        int negativeSum = 0;
        
        for (int num : array) {
            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeSum += num;
            }
        }
        
        System.out.println("Sum of positive elements: " + positiveSum);
        System.out.println("Sum of negative elements: " + negativeSum);
    }
}
