package com.twowaits.tathastu_schlr;

import java.util.Scanner;

public class Que3_Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,fact=1;
        int number=0;//It is the number to calculate factorial
        System.out.println("Enter the Factorial no ");
        number = sc.nextInt();
        sc.close();

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
