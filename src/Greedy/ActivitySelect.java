package Greedy;

import java.util.ArrayList;

/*Qs: Activity Selection Problem: 
Given n activities with their start and finish times, 
select the maximum number of activities that can be performed by a single person,
 assuming that a person can only work on a single activity at a time.
 Given that activites are sorted on the basis of endtime
 */
public class ActivitySelect {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = end.length;
        int lastEnd = 0; //to store the end time of last selected activity
        int maxAct =0; //count variable
        ArrayList<Integer> ans  = new ArrayList<>(); //to store the selected activities

        //for first activity
        maxAct=1;
        ans.add(0); //add index of first activity to list
        lastEnd = end[0];
        // for rest
        for (int i = 1; i < n; i++) {
            if(start[i] >= lastEnd){
                maxAct++;
                lastEnd = end[i]; //update the last end time
                ans.add(i); //add index of activity to list
            }
        }


        for (int i : ans) {
            System.out.print("A"+i + " ");
        }
    }
    
}
