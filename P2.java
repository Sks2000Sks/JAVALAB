package com.company;

import java.util.Scanner;

class Address {
    String street_num, city, state, country;

    public Address(String street_num, String city, String state, String country) {
        this.street_num = street_num;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street_num='" + street_num + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Student {
    String USN, Name;
    Address addr;

    public Student(String USN, String name, Address addr) {
        this.USN = USN;
        Name = name;
        this.addr = addr;
    }
}

class College {
    String Name;
    Address addr;

    public College(String name, Address addr) {
        Name = name;
        this.addr = addr;
    }
}

class Employee {
    String EmpID, Name;
    Address addr;

    public Employee(String empID, String name, Address addr) {
        EmpID = empID;
        Name = name;
        this.addr = addr;
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Student[] stud = new Student[n];
        College[] clg = new College[n];
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the street_num,city, state, country");
            Address addr = new Address(sc.next(), sc.next(), sc.next(), sc.next());

            System.out.println("enter the student usn and name");
            stud[i] = new Student(sc.next(), sc.next(), addr);

            System.out.println("enter college name");
            clg[i] = new College(sc.next(), addr);

            System.out.println("enetr the employee id and name");
            emp[i] = new Employee(sc.next(), sc.next(), addr);
        }

        System.out.println("Student details\nUSN NAME ADDRESS");
        for (int i = 0; i < n; i++) {
            System.out.println(stud[i].Name + " " + stud[i].USN + " " + stud[i].addr);
        }


        System.out.println("Employee details\nEMPID NAME ADDRESS");
        for (int i = 0; i < n; i++) {
            System.out.println(emp[i].EmpID + " " + emp[i].Name + " " + emp[i].addr);
        }

        System.out.println("College details\n NAME ADDRESS");
        for (int i = 0; i < n; i++) {
            System.out.println(clg[i].Name + " " + clg[i].addr);
        }

    }
}

