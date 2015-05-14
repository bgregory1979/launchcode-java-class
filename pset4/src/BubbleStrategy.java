/**
 * Created by brian on 5/13/15.
 */
public class BubbleStrategy implements SortStrategy {
    public int[] sort(int[] data) {
        int size = data.length;
        for (int i = 0; i < (size - 1 ); i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (data[j] > data[j + 1])
                {
                    int temp;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
    public static void main(String[] args) {
        int[] test = {7, 4, 1, 8, 0, 3, 5, 2};
        BubbleStrategy xyz = new BubbleStrategy();
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
