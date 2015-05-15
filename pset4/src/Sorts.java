/**
 * Created by brian on 5/15/15.
 */
public class Sorts {
    public static SortStrategy bubbleStrategy() {
        return new BubbleStrategy();
    }

    public static SortStrategy mergeStrategy() {
        return new MergeStrategy();
    }

    public static SortStrategy insertionStrategy() {
        return new InsertionStrategy();
    }
}
