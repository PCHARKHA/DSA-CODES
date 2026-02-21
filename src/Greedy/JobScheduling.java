// Given a set of jobs where each job has a deadline and profit associated with it. 
// Each job takes a single unit of time to complete and only one job can be scheduled at a time. 
// We need to find the maximum profit and the number of jobs done.
package Greedy;

public class JobScheduling {
    public static void main(String[] args) {
        int jobs[][] = {{1, 20, 2}, {2, 15, 2}, {3, 10, 1}, {4, 5, 3}}; //{jobId, profit, deadline}
        int n = jobs.length;

        // Sort jobs based on profit in descending order
        java.util.Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        boolean[] slot = new boolean[n]; // To keep track of free time slots
        int countJobs = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (starting from the last possible slot)
            for (int j = Math.min(n, jobs[i][2]) - 1; j >= 0; j--) {
                if (!slot[j]) { // If the slot is free
                    slot[j] = true; // Mark this slot as occupied
                    countJobs++; // Increment count of jobs done
                    totalProfit += jobs[i][1]; // Add profit of this job
                    break; // Move to the next job
                }
            }
        }

        System.out.println("Number of jobs done: " + countJobs);
        System.out.println("Total profit: " + totalProfit);
    }
    
}
