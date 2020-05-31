package com.company;

import java.util.Scanner;

@FunctionalInterface
interface PerformOperation{
   boolean operate(int x);
}

public class P8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("1.evenodd 2.prime 3.palindrome\nEnter the operation and enter the number");
            int ch,num;
            ch=sc.nextInt();  num= sc.nextInt();
            switch (ch){
                case 1:PerformOperation op1=(int x)->{
                    return x%2==0;
                };
                if(op1.operate(num)) System.out.println("Given number is even");
                else System.out.println("Given number is odd");
                    break;
                case 2:PerformOperation op2=(int x)->{
                    for(int i=2;i<Math.sqrt(x);i++)
                    {
                        if(x%i==0)
                            return false;
                    }
                    return  true;
                };
                    if(op2.operate(num)) System.out.println("Given number is  prime");
                    else System.out.println("Given number is not prime");

                    break;
                case 3: PerformOperation op3=(int x)->{
                    int temp=x,sum=0;
                    while(temp>0)
                    {
                        sum=(sum*10)+(temp%10);
                        temp=temp/10;
                    }
                    if(sum==x)
                        return true;
                    else
                        return false;
                };
                    if(op3.operate(num)) System.out.println("Given number is palindrome");
                    else System.out.println("Given number is not palindrome");

                    break;
                default:System.exit(1);

            }


        }
    }
}

