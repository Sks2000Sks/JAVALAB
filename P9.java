package com.company;


import java.util.ArrayList;
import java.util.Collections;

class Collec{

    ArrayList<String> al= new ArrayList<>();
    ArrayList<String> ral= new ArrayList<>();
    String [] arr;
    public void add()
    {
        al.add("violet"); al.add("blue");al.add("indigo"); al.add("green");al.add("yellow"); al.add("orange");
        System.out.println(al);
    }

    public void copy(){
        arr=new String[al.size()];
        al.toArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public void reverse(){
        for(int i=al.size()-1;i>=0;i--) {
            ral.add(al.get(i));
        }
        System.out.println(ral);
    }

    public void sublist(){

        System.out.println(  "sublist "+ al.subList(1,5));
    }

    public void sort(){
        Collections.sort(al);
        System.out.println(al);
    }

    public void clonef(){
        ArrayList<String> cal= (ArrayList<String>)al.clone();
        System.out.println(cal);
    }
}
public class P9 {
    public static void main(String[] args) {
        Collec c = new Collec();
        c.add();c.clonef();c.copy();c.reverse();c.sort();c.sublist();

    }
}
