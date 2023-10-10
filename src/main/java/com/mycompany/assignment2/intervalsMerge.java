/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class intervalsMerge {

    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        System.out.println("How many intervals do you want to add?");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Interval " + (i + 1));
            System.out.println("Start value: ");
            int start = s.nextInt();
            System.out.println("End value: ");
            int end = s.nextInt();
            intervals.add(new int[]{start, end});
        }
        intervalsMerge intervalsMerge = new intervalsMerge();
        intervalsMerge.mergeIntervals(intervals);
    }

    public void mergeIntervals(List<int[]> intervals) {
        int n = intervals.size();
        if (intervals.isEmpty()) {
            System.out.print("List is empty");
        }
        int currentEnd, nextStart;
        int i = 0;
        while (i < n - 1) {
            currentEnd = intervals.get(i)[1];
            nextStart = intervals.get(i + 1)[0];
            if (nextStart < currentEnd || nextStart == currentEnd) {
                if (intervals.get(i)[1] < intervals.get(i + 1)[1]) {
                    intervals.get(i)[1] = intervals.get(i + 1)[1];
                }
                intervals.remove(i + 1);
                n--;
            } else {
                i++;
            }
        }
        System.out.println("\nFinal Intervals\n{");
        for (int[] in : intervals) {
            System.out.println("[" + in[0] + "," + in[1] + "],");
        }
        System.out.println("}");
    }
}
