package com.company;
import java.util.*;
public class countApplesOranges {
    public static void main(String[] args){
        int s = 2;
        int t = 3;
        int b = 5;
        int a = 1;
        int m = 1;
        int n = 1;
        ArrayList<Integer> apples = new ArrayList<Integer>(0);
        apples.add(-2);
        apples.add(0);
        apples.add(0);
        ArrayList<Integer> oranges = new ArrayList<Integer>(0);
        oranges.add(-1);
        oranges.add(0);
        oranges.add(0);
        countApplesAndOranges(s, t, a, b, m, n, apples,oranges);

    }

   static void countApplesAndOranges(int s, int t, int a, int b,int m, int n, List<Integer> apples, List<Integer> oranges) {
       int count1 = 0;
       int count2 = 0;
       m = apples.size();
       n = oranges.size();
       if(m>0 && n>0) {
           for (int i = 0; i < m; i++) {
               int org = a;
               int d = apples.get(i);
               a = a + d;
               if (a >= s && a <= t) {
                   count1++;
               }
               a = org;
           }

           for (int i = 0; i < n; i++) {
               int org = b;
               int d = oranges.get(i);
               b = b + d;
               if (b >= s && b <= t) {
                   count2++;
               }
               b = org;
           }

       }
       else{
           count1 = 0;
           count2 = 0;
       }
       System.out.println(count1);
       System.out.println(count2);

   }
}

