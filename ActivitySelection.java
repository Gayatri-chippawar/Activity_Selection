package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ActivitySelection {
    //O(nlogn)
    public static void sortbyStart(int[] start, int[] end){
        int activities[][] = new int[start.length][3];

        for (int i=0; i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda of func
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        //sorting on basis of end i.e o[2]

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);

        int cnt=1;
        int lastEnd = activities[0][2];

        for (int i=1; i<start.length; i++){
            if(activities[i][1]>=lastEnd){
                cnt++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum Activity : "+cnt);
        for (int i=0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    //O(n)
    public static void getActivity(int[] start, int[] end){
        int cnt=1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastEnd = end[0];
        for (int i=1; i<start.length; i++){
            if(start[i]>=lastEnd){
                cnt++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum Activity : "+cnt);
        for (int i=0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int[] start1 = {0,1,3,5,5,8};
        int[] end1 = {6,2,4,7,9,9};

        getActivity(start,end1);
        //O(nlogn)
        sortbyStart(start1, end1);
    }
}
