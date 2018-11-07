/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.pkg313.java;
import java.util.Scanner;

/**
 *
 * @author Adeotun
 */
public class CSC313Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello WOrld");
        
//        
        Scanner input = new Scanner(System.in);
        int age;
        String name;
        float CGPA;
        String programme;
        String matricno;
        System.out.print("Welcome! Save your student data here!");
        System.out.print("/nWhat is your name? ");
        name = input.next();
        System.out.print("How old are you? ");
        age = input.nextInt();
        System.out.print("What program are you enrolled in? ");
        programme = input.next();
        System.out.print("What is your Matric Number? ");
        matricno = input.next();
        System.out.print("What is your Current Grade Point Average? ");
        CGPA = input.nextFloat();
        System.out.println("Alright, "+name+".\nYou are "+age+" years old. Your Major is "+programme+" with a CGPA of "+CGPA+". Matriculation Number = "+matricno+".");


//        String aString = "Fute Jallon Falls!!";
//        System.out.println(aString.substring(11,15));
//        
//        String aaString = "Wikki Warm Springs";
//        System.out.println(aaString.substring(11));
        
        
//        String aString ="Yankari Games Reserve";
//        int index = aString.indexOf("a");
//        System.out.println(index);
        
        
        String aString ="Yankari Games Reserve";
        int index = aString.lastIndexOf("a", 4);
        System.out.println(index);
        
    }
    
}
