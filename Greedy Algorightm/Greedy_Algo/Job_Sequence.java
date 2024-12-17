package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Job_Sequence {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);
        //descending order sorting of object

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("max jobs = "+ seq.size());
        System.out.println(seq);
//        for(int i = 0; i < seq.size(); i++){
//            System.out.print(seq.get(i)+" ");
//        }
//        System.out.println();
    }
}