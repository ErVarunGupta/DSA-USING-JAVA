import java.util.*;

public class Main {
    static class Jobs{
        int deadline;
        int profit;
        int id;

        Jobs(int i, int p, int d){
            id = i;
            profit = p;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{15, 7},{20, 2},{30, 5},{18, 3}, {18, 4},{10, 5},{23, 2},{16, 7},{25, 3}};

        ArrayList<Jobs> jobs = new ArrayList<>();
        for(int i = 0; i < jobInfo.length; i++){
            jobs.add(new Jobs(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //sorting in descending order according to profit
        Collections.sort(jobs, (Jobs obj1, Jobs obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Jobs curr = jobs.get(i);
            if(curr.deadline >= time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = "+seq.size());

        for(int i = 0; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();

        ArrayList<Integer> profits = new ArrayList<>();
        time = 0;
        int maxProfit = 0;
        for(int i = 0; i < jobs.size(); i++){
            Jobs curr = jobs.get(i);
            if(curr.deadline >= time){
                profits.add(curr.profit);
                time++;
            }
        }
        for(int i = 0; i < profits.size(); i++){
            maxProfit += profits.get(i);
        }
        System.out.println("max profit = "+maxProfit);
    }
}
