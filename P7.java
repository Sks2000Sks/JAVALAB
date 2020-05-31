package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Market{
    int fruitsnumber;
    Market(int fruitsnumber){
      try {
          if (fruitsnumber < 0) {
              throw new IllegalArgumentException("Negative Number");
          }
          this.fruitsnumber=fruitsnumber;
      }
      catch(IllegalArgumentException e){
        e.printStackTrace();
        }

    }

    ArrayList<String> fruits = new ArrayList<>();

    synchronized boolean isEmpty()
    {
        return fruits.isEmpty();
    }
    synchronized boolean isFull(){
        if(fruits.size()==fruitsnumber)
            return true;
        else
            return false;
    }
    synchronized void farmer(){
       while(true){
           try{
               if(isFull()){
                   wait();
               }
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
           System.out.println("Enter the fruit to be added");
           Scanner sc=new Scanner(System.in);
           String f= sc.next();
           fruits.add(f);
           System.out.println(f+" fruits is added");
           notify();
       }
        }

    synchronized void consumer(){
        while(true){
            try{
                if(isEmpty()){
                    wait();
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }


            String f= fruits.remove(0);
            System.out.println(f+" fruits is removed");
            notify();
        }

    }

}
class Farmer extends java.lang.Thread {
    Market m;
    Farmer(Market m){
        this.m=m;
    }
    public void run(){
        m.farmer();
    }

}
class Consumer extends java.lang.Thread {
    Market m;
    Consumer(Market m){
        this.m=m;
    }
    public void run(){
        m.consumer();
    }

}
public class P7 {
    public static void main(String[] args) {
        Market m = new Market(3);
        Farmer f= new Farmer(m);
        Consumer c= new Consumer(m);
        c.start();
        f.start();
    }
}
