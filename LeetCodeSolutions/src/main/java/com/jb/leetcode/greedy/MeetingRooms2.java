package com.jb.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * Given an array of meeting time intervals intervals where
 * intervals[i] = [starti, endi], return the minimum number of conference rooms required.
 *
 *
 * https://leetcode.com/problems/meeting-rooms-ii/
 *
 * @author jyotibhushan
 *
 */
public class MeetingRooms2 {

    public static void main(String[] args){
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int[][] intervals = {{0,30},{5,10},{15,20}};
        meetingRooms2.roomCount(intervals);

        int[][] intervals1 = {{7,10},{2,4}};
        meetingRooms2.roomCount(intervals1);
    }

    private int roomCount(int[][] intervals){
//        StringBuilder s = new StringBuilder();
//        s.
        if(intervals.length == 0){
            return 0;
        }

        // keeping meeting end time
        PriorityQueue<Integer> rooms = new PriorityQueue<Integer>(intervals.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        // sort by start time
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        //add first meeting end time
        rooms.add(intervals[0][1]);

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] >= rooms.peek()){
                // reuse the room when meeting is starting when one meeting has been over
                rooms.poll();
            }
            // add room no matter what because we are removing when room is being reused.
            rooms.add(intervals[i][1]);
        }
        System.out.println(" Total rooms: "+rooms.size());
        return rooms.size();
    }
}
