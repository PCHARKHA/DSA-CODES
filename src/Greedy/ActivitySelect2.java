package Greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelect2 {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int n = end.length;

        int[][] activites = new int[n][3];
        for (int i = 0; i < n; i++) {
            activites[i][0] = start[i];
            activites[i][1] = end[i];
            activites[i][2] = i; // original index
        }

        // sort by end time
        Arrays.sort(activites, Comparator.comparingInt(o -> o[1]));

        int maxAct = 1;
        int lastEnd = activites[0][1];

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activites[0][2]);

        for (int i = 1; i < n; i++) {
            if (activites[i][0] >= lastEnd) {
                maxAct++;
                lastEnd = activites[i][1];
                ans.add(activites[i][2]);
            }
        }

        System.out.println("Maximum number of activities: " + maxAct);
        System.out.println("Selected activity indices: " + ans);
    }
}