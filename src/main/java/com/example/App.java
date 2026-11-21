package com.example;

import java.util.Scanner;
public class App 
{
    public static int calc(int s,int t,int u,int v){
        int tot=s+t+u+v;
        return tot;
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        int s1 = sc.nextInt();
        System.out.println("Enter side 2:");
        int s2 = sc.nextInt();
        System.out.println("Enter side 3:");
        int s3 = sc.nextInt();
        System.out.println("Enter side 4:");
        int s4 = sc.nextInt();

        int total = calc(s1,s2,s3,s4);

        System.out.print("Total:"+total);
        sc.close();
    }
}
