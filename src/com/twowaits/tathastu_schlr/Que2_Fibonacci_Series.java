package com.twowaits.tathastu_schlr;

import java.util.Scanner;

public class Que2_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");

        int n1=0,n2=1,n3,i,count=0;
        count = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series till " + count + " terms:");
        System.out.print(n1);//printing 0

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
