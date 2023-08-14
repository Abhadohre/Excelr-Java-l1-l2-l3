import java.util.HashMap;

public class occurrence {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 3, 5, 2, 1, 4 };
        
        HashMap<Integer, Integer> occurrences = findElementOccurrences(array);
        
        System.out.println("Element occurrences:");
        for (int num : occurrences.keySet()) {
            int count = occurrences.get(num);
            System.out.println(num + " occurs " + count + " times");
        }
    }
    
    public static HashMap<Integer, Integer> findElementOccurrences(int[] array) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        return occurrences;
    }
}
