package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final double tax = 0.8;
        double pay = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("employee name");
        String employeeName = input.next();
        System.out.println("hours worked");
        int hoursWorked = input.nextInt();
        System.out.println("hourly wage");
        double wage = input.nextDouble();

        if (hoursWorked > 45){

            int overTime = hoursWorked - 45;
            pay = (double)overTime*wage*1.5;
            pay = (double)pay + ( hoursWorked - overTime)*wage;


        }
        else{
            pay = (double)hoursWorked*wage;
        }
        System.out.println("hours payed"+ hoursWorked);
        System.out.println("pretax pay:"+pay);
        double finalPay = pay * tax;
        System.out.println("post tax pay:"+finalPay );



    }
}
