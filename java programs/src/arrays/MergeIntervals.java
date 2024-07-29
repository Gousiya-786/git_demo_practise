package arrays;
import java.util.*;
public class MergeIntervals {

	public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on the starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMergedInterval = merged.get(merged.size() - 1);
            
            if (currentInterval[0] <= lastMergedInterval[1]) {
                // There is overlap, merge the intervals
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentInterval[1]);
            } else {
                // No overlap, add the current interval to the list of merged intervals
                merged.add(currentInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = solution.merge(intervals);
        
        System.out.print("Merged intervals: ");
        for (int[] interval : mergedIntervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        // Output: [[1, 6], [8, 10], [15, 18]]
    }
}
