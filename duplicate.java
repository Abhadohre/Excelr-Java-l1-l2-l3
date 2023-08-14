import java.util.HashMap;

public class duplicate{
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 3, 5, 6, 7, 8, 5 };
        
        HashMap<Integer, Integer> occurrences = findDuplicateElements(array);
        
        System.out.println("Duplicate elements:");
        for (int num : occurrences.keySet()) {
            int count = occurrences.get(num);
            if (count > 1) {
                System.out.println(num + " occurs " + count + " times");
            }
        }
    }
    
    public static HashMap<Integer, Integer> findDuplicateElements(int[] array) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        return occurrences;
    }
}
