/**
 * Created by brian on 5/15/15.
 */
public class InsertionStrategy implements SortStrategy {
    public int[] sort(int[] data) {
        int j;
        int key;
        int i;

        for (j = 1; j < data.length; j++) {
            key = data[j];
            for(i = j - 1; (i >= 0) && (data[i] > key); i--) {
                data[i + 1] = data[i];
            }
            data[i + 1] = key;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] test = {7, 4, 1, 8, 0, 3, 5, 2};
        SortStrategy xyz = Sorts.insertionStrategy();
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        long startTime = System.nanoTime();
        xyz.sort(test);
        long endTime = System.nanoTime();
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println("This sort took " + (endTime - startTime) / 1000000 + " ms.");
    }
}
