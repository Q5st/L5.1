package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] num = new int[10];
        int a=-100, b=100;
        int max= a, sum=0, quan=0;
        for (int i=0; i<10; i++){
            num[i]= (int) (Math.random()*(b-a))+a;
            if (num[i]>max){ max=num[i];}
            if (num[i]>0){sum+=num[i];}
            if (num[i]<0) {quan++; }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("max:" + max + ", sum:" + sum + ", quantity:" + quan);
    }
}
