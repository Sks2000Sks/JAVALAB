package com.company;

import java.util.Scanner;

class DE extends Exception{
    float amount;
    DE(float a){
        amount=a;
    }
    @Override
    public String toString() {
        return "deposit of old currency of "+ amount+" crosses 5000 and cant be deposited";
    }
}
class Account{
    float balance;
    Account()
    {
        balance=500;
    }
    public void deposit(float amount, String ct){
        try{
            if(ct.toUpperCase().equals("OLD")&& amount>5000){
                throw new DE(amount);
            }
            balance+=amount;
        }catch (DE e){
            System.out.println(e);
        }
    }
    public void currBalance()
    {
        System.out.println(" Balance is "+balance);
    }

    public void wihtdraw(float amount){
        if(balance<500 || balance-amount<500){
            System.out.println("balance is less cant withdraw");
        }
        else
        {
            balance-=amount;
        }


    }
}
public class P6 {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Account a=new Account();
        System.out.println("1.deposit 2. currbalance 3. withdraw");
        while(true)
        {
            System.out.println("enter your choice");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enetr the amount and currency type to deposit");
                    a.deposit(sc.nextFloat(),sc.next());
                    break;
                   case 2:a.currBalance();break;
                case 3:System.out.println("enetr the amount to withdraw");a.wihtdraw(sc.nextFloat());break;
                default:break;
            }
        }
    }
}
