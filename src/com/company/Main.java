package com.company;


import java.util.Scanner;

public class Main {
    private static String name;
    private static String jobt;


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Job Title please?");
        jobt=sc.next();
        Person p=new Person();

        p.j.setJob(jobt);

        System.out.println("The Job Title is : "+ p.j.toString());

        System.out.println("\nThe Schools attended are : \n" + p.ed.toString());




        }
    }

