/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
package pkg06_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;
public class printrollnumbers
{
    public static void main(String[] args) {
        String roll;
        float m,n,o;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++)
        {
            System.out.print("\nEnter Your Roll Number: ");
            roll = sc.next();

            System.out.print("Enter Your First Subject Mark: ");
            m = sc.nextFloat();

            System.out.print("Enter Your Second Subject Mark: ");
            n = sc.nextFloat();
            
            System.out.print("Enter Your Third Subject Mark: ");
            o = sc.nextFloat();

            float avg = (m + n + o) / 3;

            if(m<=100 && n<=100 && o<=100)
                {
                    System.out.printf("\nAverage Mark of Roll Number %s is %.1f\n", roll, avg);
                }
            else
                {
                    System.out.println("\nPlease Enter Your Marks Between 0 to 100");
                }
        }
    }
}

