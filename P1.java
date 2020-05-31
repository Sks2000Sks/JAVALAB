package com.company;

import java.util.Scanner;

class Complex{
    int r,i;
    Complex()
    {
        r=0;i=0;
    }
    Complex(int r, int i){
        this.r=r;this.i=i;
    }

    Complex add(Complex a, Complex b){
        Complex c= new Complex();
        c.r=a.r+b.r;
        c.i=a.i+b.i;
        return c;
    }

    Complex subtract(Complex a, Complex b){
        Complex c= new Complex();
        c.r=a.r-b.r;
        c.i=a.i-b.i;
        return c;
    }
    public void display()
    {
        System.out.println(r+" +i "+i);
    }
}
public class P1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first complex number");
	    Complex a= new Complex(sc.nextInt(),sc.nextInt());
	    a.display();
        System.out.println("Enter the second complex number");
        Complex b= new Complex(sc.nextInt(),sc.nextInt());
        b.display();
        Complex c=new Complex();
        c=c.add(a,b);
        System.out.println("Sum of complex numbers is "); c.display();
        c=c.subtract(a,b);
        System.out.println("Difference of complex numbers is "); c.display();
    }
}
