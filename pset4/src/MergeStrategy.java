/**
 * Created by brian on 5/13/15.
 */
public class MergeStrategy implements SortStrategy {
    public int[] sort(int[] data) {
        int size = data.length;
            if (size <= 1) {
                return data;
            }
            else {
                int mid = size / 2;
                int firstHalf[] = new int[mid];
                int secondHalf[] = new int[size - mid];

                for (int i = 0; i < mid; i++) {
                    firstHalf[i] = data[i];
                }
                for (int i = mid; i < size; i++) {
                    secondHalf[i - mid] = data[i];
                }
                return merge(data, sort(firstHalf), sort(secondHalf));
            }
    }

    private static int[] merge(int[] data, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                data[i + j] = a[i];
                ++i;
            } else {
                data[i + j] = b[j];
                ++j;
            }
        }
        for(; i < a.length; i++) data[i + j] = a[i];
        for(; j < b.length; j++) data[i + j] = b[j];
        return data;
    }

    public static void main(String[] args) {
        int[] test = {7, 4, 1, 8, 0, 3, 5, 2};
        MergeStrategy xyz = new MergeStrategy();
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        xyz.sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}

