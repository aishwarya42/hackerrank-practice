package com.company;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
public class roundoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>(0);
        int n = sc.nextInt();
        for(int i = 0;i<=n-1;i++){
            grades.add(sc.nextInt());
        }
        System.out.println(gradingStudents(grades));
    }
         static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
            // Write your code here
            for (int i = 0; i <= grades.size()-1; i++) {
                int a = grades.get(i);
                if(a>100){
                    grades.set(i,0);
                }
                int b = (((grades.get(i) / 5) * 5 )+ 5) ;
                if(a>33){
                    if (Math.abs(a - b) < 3)
                    {
                        grades.set(i,b);
                    }
                }
                else {
                    grades.set(i, a);
                }
            }
            return grades;
        }
    }

