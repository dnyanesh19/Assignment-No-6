/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.
package pkg06_java_assignment;

import java.util.Scanner;

/**
 *
 * @author SHARDUL
 */
public class Arrayof10objects {

    private int empNum;
    private double empSal;

    public Arrayof10objects(int e, double s){
        empNum = e;
        empSal = s;
    }

    public int getEmpNum(){
        return empNum;
    }
    public double getSalary(){
        return empSal;

    }

    public static void main(String[] args) {

        Arrayof10objects[] array = new Arrayof10objects[10];
        Scanner sc = new Scanner(System.in);        
        for(int i = 0; i < 10; i++) {
            System.out.printf("Please enter your employee number:");
            int e = sc.nextInt();
            System.out.printf("Please enter your salary:");
            double s = sc.nextDouble();
            array[i] = new Arrayof10objects(e, s);
        }
    }
}