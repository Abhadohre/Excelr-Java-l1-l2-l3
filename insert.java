import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1, 6 };
        int elementToInsert = 7;

        int[] newArrayEnd = insertAtEnd(array, elementToInsert);
        int[] newArrayStart = insertAtStart(array, elementToInsert);
        int[] newArrayMiddle = insertInMiddle(array, elementToInsert, 2); // Insert at index 2

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after inserting at end: " + Arrays.toString(newArrayEnd));
        System.out.println("Array after inserting at start: " + Arrays.toString(newArrayStart));
        System.out.println("Array after inserting in middle: " + Arrays.toString(newArrayMiddle));
    }

    public static int[] insertAtEnd(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int[] insertAtStart(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }

    public static int[] insertInMiddle(int[] array, int element, int index) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
