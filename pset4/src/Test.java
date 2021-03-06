/**
 * Created by brian on 5/14/15.
 */
public class Test {
    public static void populate(int data[]) {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000);
        }
    }

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        ArraySorter arraySorter1 = new ArraySorter(Sorts.mergeStrategy());
        int[] sampleArray1 = new int[10000];
        populate(sampleArray1);
        long startTime = System.nanoTime();
        arraySorter1.sortArray(sampleArray1);
        long endTime = System.nanoTime();
        printArray(sampleArray1);
        System.out.println("This sort took " + (endTime - startTime)/ 1000000 + " ms.");
    }
}
