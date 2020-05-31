package com.company;


import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String [] str=str1.split(" ");

        System.out.println("Penultimate word "+str[str.length-2]);

        String str2=sc.nextLine();
        System.out.println("Replacement of java with python and vice versa");
        str2=str2.replace("java","pyhton");
        System.out.println(str2);
        str2=str2.replace("python","java");
        System.out.println(str2);

        System.out.println("Using Split method");
        String str3=sc.nextLine();
        String[] res=str3.split("\\$");
        for(String x: res)
            System.out.println(x+" ");

    }
}
