package com.company;
import java.util.*;
public class kangrooJump {
    public static void main(String[] args) {
        int x1 = 21;
        int v1 = 6;
        int x2 = 47;
        int v2 = 3;
        System.out.println(kangaroo(x1, v1, x2, v2));

    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String s1 = "YES";
        String s2 = "NO";
        if (v1 > v2) {
             for(int i =0 ;i< Integer.MAX_VALUE;i++){
                int d1 = x1 + v1*i;
                int d2 = x2 + v2*i;
                if (d1 == d2) {
                    return s1;
                }
                if(d1>d2){
                    return s2;
                }
            }
        }
        return s2;
    }
}
