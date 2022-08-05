/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.*;

public class Height_Average {
    
  public static void main(String[] args){
  	
  	float sum = 0, avg;
  	
    Scanner s1 = new Scanner(System.in);
    
    System.out.println("Enter number of students");
    int n = s1.nextInt();
    
    System.out.println("Enter height of students");
    
    for (int i = 0; i < n; i++) {
    	System.out.println("Student " + (i+1) + ":");
    	float height = s1.nextFloat();
    	sum = sum + height;
    }
    
    avg = sum/n;
    System.out.println("Average heigth : " + avg);
  }
}
