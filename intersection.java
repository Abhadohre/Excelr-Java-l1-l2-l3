import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };
        
        int[] intersection = findIntersection(array1, array2);
        
        System.out.print("Intersection of the two arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] findIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : array1) {
            set1.add(num);
        }
        
        for (int num : array2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] intersection = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            intersection[index++] = num;
        }
        
        return intersection;
    }
}
