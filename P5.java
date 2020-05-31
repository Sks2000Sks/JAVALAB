package com.company;

import org.w3c.dom.ls.LSOutput;

interface Animal{
  void eat();
  void sound();
}

interface TiredAnimal extends Animal{
    default void sleep()
    {
        System.out.println("animal is sleeping");
    }
}

class Lion implements TiredAnimal{
    public void eat()
    {
        System.out.println("lion is eating");
    }
    public void sound(){
        System.out.println("lion is making sound");
    }
    public void lionmethod(){
        System.out.println("lion is king of jungle");
    }
}

class Snake implements  TiredAnimal{
    public  void eat()
    {
        System.out.println("snake is eating");
    }
    public void sound(){
        System.out.println("snake is making sound");
    }
    public void snakemethod(){
        System.out.println("snake is not trustable");
    }
}

public class P5 {
    public static void main(String[] args) {
        Lion l= new Lion();
        Snake s=new Snake();
        l.eat();l.lionmethod();l.sound();l.sleep();
        s.eat();s.snakemethod();s.sound();s.sleep();

    }
}
